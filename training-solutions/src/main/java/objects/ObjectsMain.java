package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        System.out.println("Gyakorlati feladat - Objektumok");
        //Példányosíts egy Book objektumot, de ne add értékül semminek! Meg tudod ezt tenni? Hozzá tudsz férni később?
        new Book();
        //A System.out.println() metódus paramétereként adj át egy, a paraméterben most példányosított objektumot! Mit ír ki?
        System.out.println(new Book());
        //Adj neki értéket, méghozzá a null literált! Írasd ki az értékét!
        Book emptyBook = null;
        System.out.println(emptyBook);
        //Vizsgáld meg, hogy az emptyBook változó értéke null érték-e! Írd ki a vizsgálat eredményét!
        System.out.println(emptyBook == null);
        //Definiálj egy book nevű változót, és adj értékül neki egy újonnan példányosított Book objektumot!
        Book book = new Book();
        //Írasd ki a book változó értékét!
        System.out.println(book);
        //Adj értéket neki, null literált, majd írd ki az értékét!
        book = null;
        System.out.println(book);
        //Adj neki értékül egy új Book példányt, majd írd ki!
        book = new Book();
        System.out.println(book);
        // Hozz létre egy anotherBook változót, és adj értékül neki egy új Book példányt!
        Book anotherBook = new Book();
        // Hasonlítsd össze egyenlőség operátorral (==) a book és az anotherBook változó értékét, és írd ki az eredményt!
        System.out.println(book == anotherBook);
        // Az anotherBook változó értékéül add a book változó értékét! Írd ki!
        anotherBook = book;
        System.out.println(anotherBook);
        //Hasonlítsd össze egyenlőség operátorral (==) a book és az anotherBook változó értékét, és írd ki az eredményt!
        System.out.println(book == anotherBook);
        System.out.println();

        System.out.println("Gyakorlati feladat - Objektumok száma");
        //Definiálj egy Book tömböt, és adj értékül neki egy tömb literált, három példányosított Book objektummal!
        Book[] books = {new Book(), new Book(), new Book()};
        //Definiálj egy List<Book> listát, és az Arrays.asList() metódust használva tegyél bele három példányosított elemet!
        List<Book> listOfBooks = Arrays.asList(new Book(), new Book(), new Book());
        //Definiálj egy List<Book> üres listát, majd külön utasításokban adj hozzá három példányosított objektumot!
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book());
        bookList.add(new Book());
        bookList.add(new Book());
        //Írd ki a tömb és a listák tartalmát a konzolra!
        System.out.println(Arrays.toString(books));
        System.out.println(listOfBooks);
        System.out.println(bookList);
        System.out.println();

        System.out.println("Gyakorlati feladat - Objektumok száma");
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;
        System.out.println("book1" + book1);
        System.out.println("book2" + book2);
        System.out.println("book3" + book3);
        System.out.println("book4" + book4);
        System.out.println("book5" + book5);
        System.out.println("book6" + book6);
        System.out.println("book7" + book7);
    }
}
