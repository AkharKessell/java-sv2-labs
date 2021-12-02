package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    @Test
    void testPrefix() {
        Prefix prefix = new Prefix();

        List<String> originalWords = Arrays.asList("cat", "dog", "cam", "not", "cow");
        List<String> result = prefix.getWordsStartWith(originalWords, "ca");
        assertEquals(2, result.size());
        assertTrue(result.contains("cat"));
        assertFalse(result.contains("not"));
    }
}