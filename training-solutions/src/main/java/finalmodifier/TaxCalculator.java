package finalmodifier;

import java.util.Scanner;

public class TaxCalculator {
    public static final int TAX =27;

    public double tax(double price){
        return price * (TAX / 100.0);
    }
    public double priceWithTax(double price) {
        return price + tax(price);
    }
}
