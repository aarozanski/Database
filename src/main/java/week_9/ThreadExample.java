package week_9;

public class ThreadExample implements Runnable {
    private final int countUntil; // Variable to store the maximum count for each thread

    ThreadExample(int countUntil) { // Constructor to initialize the thread with a count limit
        this.countUntil = countUntil;
    }

    @Override
    public void run() { // The method that runs when the thread starts
        int count = 0; // Local counter variable
        while (count < countUntil) { // Loop until the counter reaches the limit
            count++; // Increment the counter
        }
        System.out.println(Thread.currentThread().getName() + " finished counting to " + countUntil); // Print which thread finished and its count
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample(5000000), "Thread1"); // Create a new thread named "Thread1"
        Thread thread2 = new Thread(new ThreadExample(5000000), "Thread2"); // Create another new thread named "Thread2"

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread

        try {
            thread1.join(); // Wait for the first thread to finish
            thread2.join(); // Wait for the second thread to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Properly handle an InterruptedException by re-interrupting the thread
        }

        System.out.println("Both threads have finished their tasks."); // Print a message once all threads are finished
    }
}

