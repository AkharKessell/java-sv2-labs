package src.main.java.introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Válasszon az alábbi menüpontok közül:");
        System.out.println();
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        int button = scanner.nextInt();

        if (button ==1){
            System.out.println("1. Felhasználók listázása");
        }
        if (button == 2 ) {
            System.out.println("2. Felhasználó felvétele");
        }
    }
}
