package week_1;

import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        if (n <= 3) return true; // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false; // Check for divisibility by 2 or 3
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false; // Check divisibility by all numbers of form 6k ± 1
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner object is created to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        // Input from user
        int n = scanner.nextInt();

        // Check for valid input and if the number is prime
        if (n < 2) {
            System.out.println("It is not a prime number");
        } else if (n == 2) {
            System.out.println("It is the only EVEN prime number");
        } else {
            if (isPrime(n)) {
                System.out.println("The " + n + " is a PRIME number");
            } else {
                System.out.println("The " + n + " is NOT a PRIME number");
            }
        }

        scanner.close();
    }
}

