package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void testCreation() {
        Point point = new Point(9, 8);
        assertEquals(9L, point.getxPos());
        assertEquals(8L, point.getyPos());
    }

    @Test
    void testGetDistance() {
        Point point01 = new Point(0, 0);
        Point point02 = new Point(10, 10);
        assertEquals(14L, point01.distance(point02));
    }
}
