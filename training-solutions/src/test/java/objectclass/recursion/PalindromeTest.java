package objectclass.recursion;

import org.junit.jupiter.api.Test;
import recursion.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome pal = new Palindrome();

    @Test
    void testPalindrome() {
        assertTrue(pal.isPalindrome("görög"));
        assertFalse(pal.isPalindrome("automata"));
    }

}