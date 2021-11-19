package stringbuilder;

public class PalindromeValidatorMain {

    public static void main(String[] args) {
        PalindromeValidator validator = new PalindromeValidator();

        System.out.println(validator.isPalindrome("saippuakivikauppias"));
        System.out.println(validator.isPalindrome("no lemon, no melon"));
        System.out.println(validator.isPalindrome("red rum, sir, is murder"));
    }
}