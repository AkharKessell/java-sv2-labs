package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Első Termék neve");
        String product = scanner.nextLine();
        Store store01 = new Store(product);

        System.out.println("Második Termék neve");
        product = scanner.nextLine();
        Store store02 = new Store(product);

        System.out.println("Mennyi jön be elsőből? - " + store01.getProduct() + "- termék01");
        int volume = scanner.nextInt();
        store01.store(volume);

        System.out.println("Mennyi jön be másodikból? - " + store02.getProduct() + "- termék02");
        volume = scanner.nextInt();
        store02.store(volume);

        System.out.println("Ennyi van raktáron a termékekből");
        System.out.println(store01.getProduct() + " / " + store01.getStock() + " db");
        System.out.println(store02.getProduct() + " / " + store02.getStock() + " db");

        System.out.println("Mennyit küldünk az első termékből?" + " / " + store01.getProduct());
        volume = scanner.nextInt();
        store01.sent(volume);

        System.out.println("Mennyit küldünk a második termékből?" + " / " + store02.getProduct());
        volume = scanner.nextInt();
        store02.sent(volume);

        System.out.println("Raktáron: " + store01.getProduct() + " / " + store01.getStock() + "db");
        System.out.println("Raktáron: " + store02.getProduct() + " / " + store02.getStock() + "db");
    }
}
