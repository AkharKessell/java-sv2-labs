package algorithmssum.sales;

public class SalesPerson {
    private final String name;
    private final int amount;

    public SalesPerson(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}