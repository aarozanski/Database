package week_10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        library.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
    }

    @Test
    void testAddBook() {
        assertEquals(1, library.size(), "Library should have one book after adding one book");
    }

    @Test
    void testCheckOutBook() {
        library.checkOutBook(0, "User 1");
        assertFalse(library.isAvailable(0), "Book should not be available after checkout");
    }

    @Test
    void testReturnBook() {
        library.checkOutBook(0, "User 1");
        library.returnBook(0, "User 1");
        assertTrue(library.isAvailable(0), "Book should be available after being returned");
    }
}

