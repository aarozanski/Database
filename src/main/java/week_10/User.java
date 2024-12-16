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
            switch (action) {
                case 0: // Check out a book
                    // Simplified: assuming there's always at least one book to check out
                    library.checkOutBook(random.nextInt(library.size()));
                    break;
                case 1: // Return a book
                    library.returnBook(random.nextInt(library.size()));
                    break;
                case 2: // Search for a book
                    library.isAvailable(random.nextInt(library.size()));
                    break;
            }
        }
    }
}

