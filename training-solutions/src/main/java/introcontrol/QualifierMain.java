package src.main.java.introcontrol;

import java.util.Scanner;

public class QualifierMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot");
        int number = scanner.nextInt();

        if (number <=100 ) {
            System.out.println("Száz, vagy kissebb");
        }else {
            System.out.println("Száz vagy nagyobb");
        }
    }
}
