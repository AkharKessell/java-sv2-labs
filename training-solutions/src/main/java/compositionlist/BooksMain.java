package src.main.java.compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many books do you want to add?");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < bookNumber; i++) {
            System.out.println((i+1) + ". book title:");
            String title = scanner.nextLine();
            books.addBook(title);
        }
        System.out.println("Your list of books:");
        System.out.println(books.getBooks());
        System.out.println("To which book do you want to add an author?");
        String title = scanner.nextLine();
        System.out.println("Who is the author");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(title,author);
        System.out.println("Your list of books");
        System.out.println(books.getBooks());
    }
}
