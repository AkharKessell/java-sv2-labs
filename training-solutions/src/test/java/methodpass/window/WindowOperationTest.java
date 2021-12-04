package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testRiseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("livingroom", 180, 250));
        windows.add(new Window("bedroom", 180, 250));
        windows.add(new Window("kitchen", 180, 250));
        windows.add(new Window("bathroom", 120, 120));

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows, 40);

        assertEquals(290, windows.get(1).getHeight());
        assertEquals(160, windows.get(3).getHeight());
    }
}