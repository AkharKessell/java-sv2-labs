package algorithmsmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneTest {
    @Test
    void testLongest() {
        Plane plane = new Plane();

        int longest = plane.getLongestOcean("10000000111110000000000001111111111000010000010000100000111111110000101000000000111110000000000000000100000001000000000000111111000000000100000000000011");
        assertEquals(16, longest);
    }
}