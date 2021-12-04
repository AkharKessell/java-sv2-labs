package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Spark", 2, 10.10);
        String name = "Spark";

        assertEquals(name, dragon.getName());
        assertNotEquals("Wargash", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Spark", 1, 10.10);
        int heads = 1;

        assertEquals(heads, dragon.getNumberOfHeads());
        assertNotEquals(4, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() > 1);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Spark", 2, 10.10);
        double height = 10.10;

        assertEquals(height, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Spark", 2, 10.10);
        Dragon anotherDragon = null;

        assertNull(anotherDragon);
        assertNotNull(dragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Spark", 2, 10.10);
        Dragon anotherDragon = dragon;

        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Spark", 2, 10.10);
        Dragon anotherDragon = new Dragon("Spark", 2, 10.10);

        assertNotSame(dragon, anotherDragon);
    }
}