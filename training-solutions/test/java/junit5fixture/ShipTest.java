package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("MS Modigliani", 1884, 35.5);
    }

    @Test
    void testName() {
        assertEquals("MS Modigliani", ship.getName());
        assertNotEquals("Viking Vilhjalm", ship.getName());
    }

    @Test
    void testYearOfConstrucion() {
        assertEquals(1884, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1884);
        assertFalse(ship.getYearOfConstruction() == 1860);
    }

    @Test
    void testLength() {
        assertEquals(35.5, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;

        assertNull(anotherShip);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;

        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("MS Modigliani", 1884, 35.5);

        assertNotSame(ship, anotherShip);
    }
}
