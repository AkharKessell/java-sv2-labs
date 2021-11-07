package src.main.java.stringmethods.urlmanager;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocol(url);
        this.host = getHost(url);
        this.port = getPort(url);
        this.path = getPath(url);
        this.query = getQuery(url);
    }

    public void UrlManager(String url) {
        System.out.println(url);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getProtocol(String url) {
        int endIndex = url.indexOf("://");
        return url.substring(0, endIndex);
    }

    public String getHost(String url) {
        String host;
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf(":", startIndex);
        if (endIndex == -1) {
            endIndex = url.indexOf("/", startIndex);
        }
        if (endIndex == -1) {
            host = url.substring(startIndex).toLowerCase();
        } else {
            host = url.substring(startIndex, endIndex).toLowerCase();
        }
        return host;
    }

    public Integer getPort(String url) {
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf(":", startIndex);
        if (startIndex == -1) {
            return null;
        }
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            return Integer.valueOf(url.substring(startIndex + 1));
        }
        return Integer.valueOf(url.substring(startIndex + 1, endIndex));
    }

    public String getPath(String url) {
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf("/", startIndex);
        if (startIndex == -1) {
            return "";
        }
        int endIndex = url.indexOf("?");
        if (endIndex == -1) {
            return url.substring(startIndex);
        }
        return url.substring(startIndex, endIndex);
    }

    public String getQuery(String url) {
        int startIndex = url.indexOf("?");
        if (startIndex == -1) {
            return "";
        }
        return url.substring(startIndex + 1);
    }

    public boolean hasProperty(String key) {
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }


    public String getProperty(String key) {
        String[] properties = query.split("&");
        for (String str : properties) {
            String[] prop = str.split("=");
            if (prop[0].equals(key)) {
                return prop[1];
            }
        }
        return null;
    }
}
