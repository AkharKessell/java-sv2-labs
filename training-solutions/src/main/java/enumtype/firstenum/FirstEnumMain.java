package src.main.java.enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for (Continent c : Continent.values()) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(Continent.values()));
        System.out.println();

        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Arrays.toString(Ocean.values()));

        System.out.println();

        System.out.println(Football.ATTACKING.name());
        System.out.println(Arrays.toString(Football.values()));

    }
}
