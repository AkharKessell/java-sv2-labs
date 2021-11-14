package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void init() {
        words = new Words();
        words.addWord("five");
        words.addWord("hot");
        words.addWord("sit");
        words.addWord("fired");
        words.addWord("robocop");
        words.addWord("joy");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> result = Arrays.asList("five", "fired");
        words.getWordsStartWith("fi");
        assertEquals(result, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> result = Arrays.asList("hot", "sit", "joy");
        words.getWordsWithLength(3);
        assertEquals(result, words.getWords());
    }
}