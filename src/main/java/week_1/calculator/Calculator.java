package week_1.calculator;

public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }
}

