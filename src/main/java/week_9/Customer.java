package week_9;

import java.util.Random;

public class Customer implements Runnable {
    private final BankAccount account;
    private static final Random random = new Random();

    public Customer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {  // Each thread will perform 10 operations
            int amount = random.nextInt(100) + 1;  // Random amount between 1 and 100
            switch (random.nextInt(3)) {  // Randomly choose an operation
                case 0:
                    account.deposit(amount);
                    break;
                case 1:
                    account.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Balance inquiry: " + account.getBalance());
                    break;
            }

            // Sleep to simulate time delay between operations
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

