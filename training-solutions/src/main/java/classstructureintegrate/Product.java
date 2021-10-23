package src.main.java.classstructureintegrate;

public class Product {

    private String name;
    private int price;

    public Product (String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    public void incPrice (int value) {
        this.price += value;
    }

    public void decreasePrice (int value) {
        this.price -= value;
    }
}
