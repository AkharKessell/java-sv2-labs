package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a neve?");
        String owner = scanner.nextLine();

        System.out.println("Mi a számla száma? (xxxxxxxx-xxxxxxxx-xxxxxxxx)");
        String account = scanner.nextLine();

        System.out.println("Összeg: ?");
        int balance = scanner.nextInt();

        bankAccount bankAccount = new bankAccount(account, owner, balance);

        System.out.println("Infó: " + bankAccount.getInfo());

        System.out.println("Feltöltés:");
        int amount = scanner.nextInt();
        bankAccount.deposit(amount);

        System.out.println("Infó plusz: " + bankAccount.getInfo());

        System.out.println("Levonás:");
        amount = scanner.nextInt();
        bankAccount.withdraw(amount);

        System.out.println("Infó minusz: " + bankAccount.getInfo());
    }
}
