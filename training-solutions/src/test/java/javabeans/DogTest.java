package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DogTest {

    @Test
    void getSetName() {
        final String name = "Blacky";
        Dog dog = new Dog();
        dog.setName(name);

        assertEquals(name, dog.getName());
    }

    @Test
    void isSetPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(true);

        assertTrue(dog.isPedigree());
    }

    @Test
    void getSetAge() {
        final int age = 5;
        Dog dog = new Dog();
        dog.setAge(age);

        assertEquals(age, dog.getAge());
    }

    @Test
    void getSetWeight() {
        final double weight = 16.5;
        Dog dog = new Dog();
        dog.setWeight(weight);

        assertEquals(weight, dog.getWeight());
    }
}