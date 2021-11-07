package src.main.java.stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A comma-separated sentence consisting of several member sentences.");

        String sentence = scanner.nextLine();
        Scanner first = new Scanner(sentence);

        while (first.hasNext()) {
            System.out.println(first.next());
        }

        System.out.println();
        Scanner second = new Scanner(sentence).useDelimiter(", ");
        while (second.hasNext()) {
            System.out.println(second.next());
        }
    }
}
