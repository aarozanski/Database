package week_1;

import java.util.Scanner;

public class Fibonacci {

    // Method to calculate the Nth Fibonacci number iteratively

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;  // Directly return n for F(0) = 0 and F(1) = 1
        }
        // long - data type , which stores very large numbers
        long a = 0;  // F(0)
        long b = 1;  // F(1)
        long c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;  // F(n) = F(n-1) + F(n-2)
            a = b;      // Update F(n-1) to F(n-2)
            b = c;      // Update F(n-2) to F(n)

            // "a" becomes "b" , "b" becomes "c"
        }
        return c;
    }

    public static void main(String[] args) {
        // Scanner object is created to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N to compute the Nth Fibonacci number:");

        // Input from user
        int n = scanner.nextInt();

        // Check for valid input
        if (n < 0) {
            System.out.println("Please enter a non-negative integer");
        } else {
            // Calculate and display the Nth Fibonacci number
            long fibonacciNumber = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
        }

        scanner.close();
    }
}

/*Pseudocode for Iterative Fibonacci Calculation
Start:

Define a function Fibonacci(n) which takes an integer n.
Input Validation:

If n is less than 0, print "Invalid input" and stop the function.
If n equals 0, return 0.
If n equals 1, return 1.
Initialize Variables:

Set a to 0. (Represents Fibonacci(0))
Set b to 1. (Represents Fibonacci(1))
Initialize c to 0. (Will hold the value of the current Fibonacci number)
Iterate and Compute Fibonacci:

For i from 2 to n (inclusive):
Set c to a + b (This computes the next Fibonacci number).
Set a to b (This shifts the previous Fibonacci number to the next lower position).
Set b to c (This updates the last Fibonacci number to the newly computed value).
Output:

Return c (This is the Nth Fibonacci number).
End Function*/

