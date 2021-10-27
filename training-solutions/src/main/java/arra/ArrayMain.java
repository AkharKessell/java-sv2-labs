package src.main.java.arra;

public class ArrayMain {
    public static void main(String[] args) {
        String [] d = { "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(d[1]);
        System.out.println(d.length);

        int [] twoPower =  new int[5];
        for ( int i = 0; i < twoPower.length; i++) {
            if (i > 0) {
                twoPower[i] = twoPower[i-1]*2;
            }else{
                twoPower[i] = 1;
            }
        }
        for (int item: twoPower) {
            System.out.println(item + " ");
        }

        boolean[] soNotTrue = new boolean[5];
        for (var i = 0; i < soNotTrue.length; i++) {
            if (i > 0) {
                soNotTrue[i] = !soNotTrue[i - 1];
            } else {
                soNotTrue[i] = false;
            }
        }
        for (boolean i: soNotTrue) {
            System.out.print(i + " ");
        }
    }
}
