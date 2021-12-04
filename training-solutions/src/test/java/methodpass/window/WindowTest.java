package methodpass.window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    @Test
    void testCreate() {
        Window window = new Window("kitchen", 180, 250);

        assertEquals("kitchen", window.getRoomName());
        assertEquals(180, window.getWidth());
        assertEquals(250, window.getHeight());
    }
}