package sorting.cardealer;

public class Car {
    private final String brand;
    private final int year;
    private final int price;

    public Car(String brand, int year, int price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}