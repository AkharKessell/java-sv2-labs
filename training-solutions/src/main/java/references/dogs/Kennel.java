package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog01 = new Dog("Spikey", 4, "White");
        dogs.add(dog01);
        Dog dog02 = new Dog("Hektor", 5, "Black");
        dogs.add(dog02);
        Dog dog03 = new Dog("Satan", 6, "Brown");
        dogs.add(dog03);
        System.out.println(dogs);

        Dog dog04 = dogs.get(1);
        dog04.setColour("Yellow");
        System.out.println(dogs);

        Dog dog05 = new Dog("Berny", 7, "spotted");
        System.out.println(dog05);

        dog05 = dogs.get(1);
        System.out.println(dog05);

        dogs.add(dog05);
        System.out.println(dogs);

        Dog dog06 = dog04;
        dog06.setColour("Pink");
        System.out.println(dogs);

        List<Dog> dogs02 = dogs;
        Dog dog07 = dog04;
        dog07.setColour("ChestNut");
        System.out.println(dogs02);

        dog02.setColour("Stripped");
        System.out.println(dogs02);

        dog02 = null;
        System.out.println(dogs02);

        Dog dog08 = dogs.get(1);
        dog08 = null;
        System.out.println(dogs02);

        Dog dog09 = dogs.get(1);
        dog09.setColour("Squared");
        System.out.println(dogs02);
    }
}
