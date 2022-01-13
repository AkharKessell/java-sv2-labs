package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {
    /**Legyen egy private static nested class (pl. DnsEntry néven),
     amely egy név, IP-cím párost tartalmaz*/

    public static class DnsEntry {
        private final String hostName;
        private final String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }

        /**A NameServer osztály listája ilyen típusú adatokat tartalmazzon!*/
        public List<DnsEntry> dnsEntries = new ArrayList<>();

        /**Lehessen hozzáadni új név, IP-cím párost az addEntry(String hostName, String hostIp)
         metódussal, ami dobjon IllegalArgumentException kivételt Already exists szöveggel,
         ha már van ilyen IP-cím, vagy név!*/

        public void addEntry(String hostName, String hostIp) {
            for (DnsEntry actual : dnsEntries) {
                if (actual.hostName.equals(hostName) || actual.hostIp.equals(hostIp)) {
                    throw new IllegalArgumentException("Already exists");
                }
            }
            dnsEntries.add(new DnsEntry(hostName, hostIp));
        }

        /**Lehessen törölni egy bejegyzést a nevet megadva a removeEntryByName metódussal,
         ha nincs ilyen nevű, akkor ne történjen semmi!*/

        public void removeEntryByName(String hostName) {
            DnsEntry remove = null;
            for (DnsEntry actual : dnsEntries) {
                if (actual.hostName.equals(hostName)) {
                    remove = actual;
                }
            }
            if (remove != null) {
                dnsEntries.remove(remove);
            }
        }

        /**Lehessen törölni IP-cím alapján, a removeEntryByIp metódussal!
         Ha nincs ilyen IP-címmel rendelkező, akkor ne történjen semmi!*/

        public void removeEntryByIp(String hostIp) {
            DnsEntry remove = null;
            for (DnsEntry actual : dnsEntries) {
                if (actual.hostIp.equals(hostIp)) {
                    remove = actual;
                }
            }
            if (remove != null) {
                dnsEntries.remove(remove);
            }
        }

        /**Lehessen megkapni az adott névhez tartozó IP-címet (getIpByName metódussal)!
         A metódus dobjon IllegalArgumentException kivételt Element not found szöveggel, ha nincs ilyen!*/

        public String getIpByName(String hostName) {
            for (DnsEntry actual : dnsEntries) {
                if (actual.hostName.equals(hostName)) {
                    return actual.hostIp;
                }
            }
            throw new IllegalArgumentException("Element not found");
        }
        /**Lehessen megkapni az adott ip-hez tartozó nevet (getNameByIp metódussal),
         dobjon IllegalArgumentException kivételt Element not found szöveggel ha nincs ilyen!*/

        public String getNameByIp(String hostIp) {
            for (DnsEntry actual : dnsEntries) {
                if (actual.hostIp.equals(hostIp)) {
                    return actual.hostName;
                }
            }
            throw new IllegalArgumentException("Element not found");
        }
    }
}
