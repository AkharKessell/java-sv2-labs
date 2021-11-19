package chars;

import java.util.Scanner;

public class WhitespaceMain {
    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whitespace to *.Enter a sentence.");
        System.out.println(whitespace.makeWhitespaceToStar(scanner.nextLine()));
    }
}
