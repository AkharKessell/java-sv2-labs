package src.main.java.attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Head First Java");
        System.out.println(book.getTitle());

        book.setTitle("JukeBox");
        System.out.println(book.getTitle());
    }
}
