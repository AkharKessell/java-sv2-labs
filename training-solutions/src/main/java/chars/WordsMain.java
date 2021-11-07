package src.main.java.chars;

import java.util.Scanner;

public class WordsMain {
    public static void main(String[] args) {
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String input = scanner.nextLine();

        System.out.println(words.pushWord(input));
    }
}
