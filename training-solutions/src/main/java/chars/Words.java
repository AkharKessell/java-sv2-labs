package src.main.java.chars;

public class Words {

    public String pushWord(String word) {

        String pushed = "";
        for (char c : word.toCharArray()) {
            pushed += (char) (c + 1);
        }
        return pushed;
    }
}
