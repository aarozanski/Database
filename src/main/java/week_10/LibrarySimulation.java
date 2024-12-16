package week_10;

public class LibrarySimulation {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library();
        // Populate the library with books
        library.addBook(new Book(1, "1984", "George Orwell"));
        library.addBook(new Book(2, "The Great Gatsby", "F. Scott Fitzgerald"));

        // Create user threads
        Thread[] users = new Thread[5];
        for (int i = 0; i < users.length; i++) {
            users[i] = new Thread(new User(library));
            users[i].start();
        }

        // Wait for all threads to complete
        for (Thread user : users) {
            user.join();
        }

        // Display final list of available books
        library.displayAvailableBooks();
    }
}

