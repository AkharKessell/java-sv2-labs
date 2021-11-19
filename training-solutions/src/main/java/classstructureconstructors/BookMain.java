package classstructureconstructors;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Könyv írója?");
        String author = scanner.nextLine();
        System.out.println("Könyv címe?");
        String title = scanner.nextLine();

        Book book = new Book(author, title);

        System.out.println("A könyv adatai: "+ book.getAuthor() + ": " + book.getTitle());
        System.out.println("Regisztrációs szám?");
        String regNumber = scanner.nextLine();
        book.register(regNumber);

        System.out.println("Könyv adatai: " + book.getAuthor() + ": " + book.getTitle() + " /" + book.getRegNumber()  + "/");

    }
}
