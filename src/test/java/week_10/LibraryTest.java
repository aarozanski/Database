package week_10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library; // Declare a Library object for testing.

    @BeforeEach
    void setUp() {
        // Set up method that runs before each test.
        // Initializes the Library object and adds a single book to it.
        library = new Library();
        library.addBook(new Book(1, "Effective Java", "Joshua Bloch"));
    }

    @Test
    void testAddBook() {
        // Test method to check if adding a book to the library increases its size correctly.
        assertEquals(1, library.size(), "Library should have one book after adding one book");
        // Assert that the library contains exactly one book after setup.
    }

    @Test
    void testCheckOutBook() {
        // Test method to verify that a book can be checked out correctly.
        library.checkOutBook(0, "User 1"); // Attempt to check out the first book.
        assertFalse(library.isAvailable(0), "Book should not be available after checkout");
        // Assert that the book is no longer available after checking out.
    }

    @Test
    void testReturnBook() {
        // Test method to verify that a book can be returned correctly.
        library.checkOutBook(0, "User 1"); // First check out the book.
        library.returnBook(0, "User 1"); // Then return the book.
        assertTrue(library.isAvailable(0), "Book should be available after being returned");
        // Assert that the book is available again after being returned.
    }
}

