package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {

    @Test
    void testGreet() {

        Greetings greetings = new Greetings();

        assertEquals("jó éjt", greetings.greet(3, 30));
        assertEquals("jó éjt", greetings.greet(4, 0));
        assertEquals("jó reggelt", greetings.greet(6, 1));
        assertEquals("jó reggelt", greetings.greet(8, 0));
        assertEquals("jó napot", greetings.greet(9, 1));
        assertEquals("jó napot", greetings.greet(17, 30));
        assertEquals("jó napot", greetings.greet(17, 31));
        assertEquals("jó estét", greetings.greet(19, 0));
        assertEquals("jó estét", greetings.greet(20, 0));
        assertEquals(null, greetings.greet(25, 0));
    }
}