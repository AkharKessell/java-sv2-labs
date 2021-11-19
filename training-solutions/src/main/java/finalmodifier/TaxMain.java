package finalmodifier;

import java.util.Scanner;

public class TaxMain {
    public static void main(String[] args) {
        TaxCalculator calc = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Net price:");
        double price = scanner.nextDouble();
        System.out.println("Net: " + price + ".- HUF");
        System.out.println("Tax: " + calc.tax(price) + ".- HUF");
        System.out.println("Gross :" + calc.priceWithTax(price) + ".- HUF");
    }
}
