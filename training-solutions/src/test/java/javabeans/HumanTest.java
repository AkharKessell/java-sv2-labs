package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {

    @Test
    void getSetName() {
        final String name = "John Doe";
        Human human = new Human();
        human.setName(name);

        assertEquals(name, human.getName());
    }

    @Test
    void getSetWeight() {
        final double weight = 92.3;
        Human human = new Human();
        human.setWeight(weight);

        assertEquals(weight, human.getWeight());
    }

    @Test
    void getSetIQ() {
        final int iq = 153;
        Human human = new Human();
        human.setIq(iq);

        assertEquals(iq, human.getIq());
    }
}