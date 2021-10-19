package src.main.java.classstructureintegrate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Termék neve:");
        String name = scanner.nextLine();
        System.out.println("Termék ára:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println("Mennyivel növeljük az árát?");
        int amount = scanner.nextInt();
        product.incPrice(amount);
        System.out.println(product.getName() + " új ára: "+ product.getPrice() + ".-");

        System.out.println("Mennyivel csökkentsük az árát?");
        amount = scanner.nextInt();
        product.decreasePrice(amount);
        System.out.println(product.getName()+ " új ára: "+ product.getPrice() + ".-");
    }
}
