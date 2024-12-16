package week_10;

import java.util.Random;

public class User implements Runnable {
    private final Library library;
    private final Random random = new Random();

    public User(Library library) {
        this.library = library;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3 + random.nextInt(3); i++) { // Perform 3-5 actions
            int action = random.nextInt(3);
            int bookIndex = library.size() > 0 ? random.nextInt(library.size()) : -1;
            switch (action) {
                case 0: // Check out a book
                    if (bookIndex != -1) library.checkOutBook(bookIndex);
                    break;
                case 1: // Return a book
                    if (bookIndex != -1) library.returnBook(bookIndex);
                    break;
                case 2: // Search for a book
                    if (bookIndex != -1 && library.isAvailable(bookIndex)) {
                        System.out.println("Book is available for checkout.");
                    } else {
                        System.out.println("Book is not available.");
                    }
                    break;
            }
        }
    }
}


