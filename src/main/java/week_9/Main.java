package week_9;

public class BankSystemSimulator {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount(1000);  // Starting balance of 1000
        Thread[] threads = new Thread[5];  // 5 customer threads

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Customer(sharedAccount));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();  // Wait for each thread to finish
        }

        System.out.println("Final balance: " + sharedAccount.getBalance());
    }
}

