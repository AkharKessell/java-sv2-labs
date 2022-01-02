package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LongWordTest {

    @Test
    void testGetLongWord() {
        LongWord longWord = new LongWord(Paths.get("longword.txt"));
        assertEquals("LONGWORD", longWord.getLongWord());
    }

    @Test
    void testWrongFile() {
        LongWord longWord = new LongWord(Paths.get("longsword.txt"));
        IllegalArgumentException ioe = assertThrows(IllegalArgumentException.class,
                () -> longWord.getLongWord());
        assertEquals("Can't read file.", ioe.getMessage());
    }
}