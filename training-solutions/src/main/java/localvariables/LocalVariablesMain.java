package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {

        boolean b;
        b=true;
        System.out.println(b);
        b = false;
        System.out.println(b);

        int a = 2;

        int i = 3;
        int j = 4;
        int k = i;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

/*       p = 4;
        System.out.println(p); nem írja ki :) */

        String s = "Hello World";
        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(x);
            System.out.println(a);
        }
//        System.out.println(x); kommentbe sikerül kiírni :D

        System.out.println(a);
    }
}
