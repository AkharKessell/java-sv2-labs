package src.main.java.chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {

        String space = "";
        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                space += "*";
            } else {
                space += c;
            }
        }
        return space;
    }
}
