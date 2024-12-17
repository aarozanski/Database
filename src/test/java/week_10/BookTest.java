package week_10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week_10.library.Book;

public class BookTest {
    private Book book; // Declare a Book object that will be used in the tests.

    @BeforeEach
    void setUp() {
        // Set up method that runs before each test.
        // Initializes the Book object with a specific test case.
        book = new Book(1, "Effective Java", "Joshua Bloch");
    }

    @Test
    void testCheckOut() {
        // Test method to check the functionality of the checkOut method.
        assertTrue(book.isAvailable(), "Book should be available initially");
        book.checkOut("User 1"); // Perform the action to check out the book.
        assertFalse(book.isAvailable(), "Book should not be available after being checked out");
        // Check that the book's status has correctly changed to unavailable.
    }

    @Test
    void testReturnBook() {
        // Test method to check the functionality of the returnBook method.
        book.checkOut("User 1"); // First, check out the book to change its status.
        book.returnBook("User 1"); // Then, return the book to reset its status.
        assertTrue(book.isAvailable(), "Book should be available after being returned");
        // Verify that the book's status is reset to available after being returned.
    }
}


