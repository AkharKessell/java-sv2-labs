package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> books = new ArrayList<>();

    public List<String> getBooks() {
        return books;
    }

    public void addBook(String title){
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        for(int i = 0; i < books.size(); i++){
            if (books.get(i).equals(title)) {
                String booksAuthor = author + ": " + books.get(i);
                books.set(i,booksAuthor);
            }
        }
    }
}
