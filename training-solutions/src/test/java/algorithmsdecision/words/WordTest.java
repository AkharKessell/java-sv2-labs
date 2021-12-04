package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordTest {
    @Test
    void testWords() {
        Word word = new Word();

        boolean result = word.containsLongerWord(Arrays.asList("dog", "cat", "drum", "automate"), "igaz");
        assertTrue(result);
        boolean result2 = word.containsLongerWord(Arrays.asList("dog", "cat", "drum", "not"), "produktív");
        assertFalse(result2);
    }
}