package week_1;

public class PrimeChecker {
    public static void main(String[] args) {
        // Example number to check for primality
        int number = 7;

        // Calling the isPrime method to determine if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    /**
     * Checks if a given number is a prime number by checking for divisors up to half of the number.
     *
     * @param num The number to check for primality.
     * @return boolean True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1, so return false if num is less than 2
        if (num < 2) {
            return false; // Not prime by definition
        }

        // Check for divisors from 2 up to half of num
        // If num is divisible by any of these numbers, it is not prime
        for (int i = 2; i <= num / 2; i++) {
            // If num is evenly divisible by i, then it has a divisor other than 1 and itself
            if (num % i == 0) {
                // Num is divisible by i, so it is not prime
                return false;
            }
        }

        // If no divisors were found, then num is prime
        return true;
    }
}

