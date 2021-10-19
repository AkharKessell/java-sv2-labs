package src.main.java.classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a nevét!");
        String name = scanner.nextLine();
        System.out.println("Helló " + name + "!");

        System.out.println("Adja meg az e-mail címét!");
        String email = scanner.nextLine();

        System.out.println("Az Ön adatai: " + name +" / "+ email);
    }
}