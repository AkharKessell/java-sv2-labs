package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public WebShop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int findHowMany(Product product) {
        int count = 0;
        for (Product p : products) {
            if (product.equals(p)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop(List.of(
                new Product("bread", "111"),
                new Product("milk", "222"),
                new Product("cheese", "333"),
                new Product("lighter", "444"),
                new Product("paper", "555")));

        System.out.println(webShop.findHowMany(new Product("metal", "666")));
        System.out.println(webShop.findHowMany(new Product("wood", "777")));
    }
}