package chars;

public class LettersAndDigits {
    public String printLetterOrDigit(String text) {
        String mix = "";
        for (char a : text.toCharArray())
            if (Character.isAlphabetic(a)) {
                mix += a + " : word" + "\n";
            } else if (Character.isDigit(a)) {
                mix += a + " : number" + "\n";
            } else {
                mix += a + " : other" + "\n";
            }

        return mix;
    }
}
