package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("plum");
        fruit.setWeight(0.33);
        System.out.println(fruit.getName() + "| " + fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("grape");
        grape.setWeight(0.8);
        grape.setType("red");
        System.out.println(grape.getName() + "| " + grape.getWeight() + "| " + grape.getType());

        Apple apple = new Apple();
        apple.setName("apple");
        apple.setWeight(2.0);
        apple.setPieces(4);
        System.out.println(apple.getName() + "| " + apple.getWeight() + "| " + apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("apple (Golden delicious)");
        goldenDelicious.setWeight(2.0);
        goldenDelicious.setPieces(8);
        System.out.println(goldenDelicious.getName() + "| " + goldenDelicious.getWeight() + "| " + goldenDelicious.getPieces() + ", " + goldenDelicious.getColour());

        Starking starking = new Starking();
        starking.setName("apple (Starking)");
        starking.setWeight(2.0);
        starking.setPieces(8);
        System.out.println(starking.getName() + "| " + starking.getWeight() + "| " + starking.getPieces() + ", " + starking.getColour());
    }
}