package week_10;

import java.util.Random;

public class User implements Runnable {
    private final Library library;
    private final int userId;
    private final Random random = new Random();

    public User(Library library, int userId) {
        this.library = library;
        this.userId = userId;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3 + random.nextInt(3); i++) {
            int action = random.nextInt(3);
            int bookIndex = library.size() > 0 ? random.nextInt(library.size()) : -1;
            if (bookIndex == -1) continue;
            String userName = "User " + userId;
            switch (action) {
                case 0:
                    library.checkOutBook(bookIndex, userName);
                    break;
                case 1:
                    library.returnBook(bookIndex, userName);
                    break;
                case 2:
                    if (library.isAvailable(bookIndex)) {
                        System.out.println(userName + ": \"" + library.getBookTitle(bookIndex) + "\" is available for checkout.");
                    } else {
                        System.out.println(userName + ": \"" + library.getBookTitle(bookIndex) + "\" is checked out.");
                    }
                    break;
            }
        }
    }
}



