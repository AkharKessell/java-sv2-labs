package stringmethods.urlmanager;

public class UrlManagerMain {
    public static void main(String[] args) {
        String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPort());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.getQuery());
    }
}