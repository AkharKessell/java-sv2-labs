package src.main.java.cmdarguments.operation;

import java.util.Scanner;

public class OperationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Válasszon:");
        scanner.nextLine();

        for (String i: args) {
            if (i.equals("/list")) {
                System.out.println("Listázás");
            } else if (i.equals("/add")) {
                System.out.println("Hozzáadás");
            } else if (i.equals("/delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
