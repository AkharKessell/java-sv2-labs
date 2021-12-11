package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    Book book = new Book("Gyűrűk ura", 3000);

    @Test
    void testCreate() {
        assertEquals("Gyűrűk ura", book.getTitle());
        assertEquals(3000, book.price);
    }

    @Test
    void testPurchase() {
        assertEquals(6000, book.purchase(2));
    }
}