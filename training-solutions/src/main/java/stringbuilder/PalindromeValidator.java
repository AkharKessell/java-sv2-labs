package src.main.java.stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word);
        String reversed = stringBuilder.reverse().toString();
        return reversed.equalsIgnoreCase(word);
    }
}
