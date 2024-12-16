package week_10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {
    private Book book;

    @BeforeEach
    void setUp() {
        book = new Book(1, "Effective Java", "Joshua Bloch");
    }

    @Test
    void testBookCheckout() {
        assertTrue(book.isAvailable(), "Book should be available initially");
        book.checkOut("User 1");
        assertFalse(book.isAvailable(), "Book should not be available after being checked out");
    }

    @Test
    void testReturnBook() {
        book.checkOut("User 1");
        book.returnBook("User 1");
        assertTrue(book.isAvailable(), "Book should be available after being returned");
    }

    @Test
    void testAvailability() {
        book.checkOut("User 1");
        assertFalse(book.isAvailable(), "Book should report not available when checked out");
        book.returnBook("User 1");
        assertTrue(book.isAvailable(), "Book should report available after being returned");
    }
}

