package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        System.out.printf("%20s | %8s%n", "name      ", "price  ");

        Coffee coffee = new Coffee();
        coffee.setName("Long Coffee 3 Oz");
        coffee.setPrice(640);
        System.out.printf("%20s | %5d USD%n", coffee.getName(), coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Italian White 1 Oz");
        cappuccino.setPrice(690);
        System.out.printf("%20s | %5d USD%n", cappuccino.getName(), cappuccino.getPrice());
    }
}