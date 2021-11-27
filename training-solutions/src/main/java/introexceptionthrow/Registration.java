package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean validName = false;
        boolean validAge = false;

        System.out.println("Üdvözlöm!\nKérem kezdje meg a regisztrációs folyamatot!");
        System.out.println("Kérem adja meg a nevét:");
        String name = scanner.nextLine();

        try {
            validation.validateName(name);
            validName = true;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println("Kérem adja meg az életkorát:");
        String age = scanner.nextLine();

        try {
            validation.validateAge(age);
            validAge = true;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println();
        System.out.println(String.format("Az ön álal megadott adatok:\nNév: %s\nÉletkor: %s év", name, age));
        System.out.println((validName && validAge) ? "Regisztráció sikeres." : "Hibás adatok. A regisztráció sikertelen.");
    }
}