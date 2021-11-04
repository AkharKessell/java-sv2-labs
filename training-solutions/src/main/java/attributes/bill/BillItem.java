package src.main.java.attributes.bill;

public class BillItem {
    private String product;
    private int price;
    private int quantity;
    private double vatPercent;

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }
    public double calculateTotalPrice() {
        return quantity * price * (((vatPercent / 100) + 1 ));
    }

    public String getProduct() {
        return this.product;
    }
    public int getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public double getVatPercent() {
        return this.vatPercent;
    }
}
