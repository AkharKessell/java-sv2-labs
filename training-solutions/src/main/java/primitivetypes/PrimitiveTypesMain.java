package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        Integer b = 2;
        Integer c = a;
        Integer d = b;
        Integer e = Integer.valueOf(2);
        int f = Integer.valueOf(2);
        int g = Integer.valueOf(a);
        int h = Integer.valueOf(c);
        int i = Integer.parseInt("2");
        Integer j = Integer.parseInt("2");
        //-------------------------------------
        boolean k = true;
        Boolean l = true;
        boolean m = Boolean.parseBoolean("true");
        Boolean n = Boolean.parseBoolean("true");
        boolean o = Boolean.parseBoolean("TrUe");
        Boolean p = Boolean.parseBoolean(("TrUe"));
        boolean q = Boolean.parseBoolean("TreU");
        Boolean r = Boolean.parseBoolean("TreU");
    }
}
