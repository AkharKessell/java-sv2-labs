package stringbasic.characters;

import java.util.Scanner;

public class WordsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word to be spelled: ");
        String word = scanner.nextLine();

        String wordToSpell = "";
        System.out.println("Time to spell the word " + word);

        for (int i = 0; i < word.length(); i++) {
            System.out.println("Type letter number " + (i + 1));
            String num = scanner.nextLine();
                wordToSpell += num;
                System.out.println("You typed the letter " + num);
        }

        System.out.println("You spelled the word: " + wordToSpell);

        if (word.equals(wordToSpell)) {
            System.out.println("You are correct");

        } else {
            System.out.println("You are wrong");
        }

    }
}