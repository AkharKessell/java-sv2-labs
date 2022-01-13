package genericsusage.withgenerics;
import genericsusage.Book;
import java.util.List;

public class Library {

    public Book getFirstBook(List<Book> books) {
        if (books == null) {
            throw new NullPointerException("Can't be null!");
        }// Ha a könyvtárat reprezentáló kollekció null, a metódus dobjon NullPointerException kivételt!
        if (books.size() == 0) {
            throw new IllegalArgumentException("Can't be empty!");
        } // Ha a könyvtárat reprezentáló kollekció üres, a metódus dobjon IllegalArgumentException kivételt!
        return books.get(0);
    }
}