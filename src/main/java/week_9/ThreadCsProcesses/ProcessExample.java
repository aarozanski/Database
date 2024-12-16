package week_9.ThreadCsProcesses;

import java.io.BufferedReader; // Import for reading input stream
import java.io.IOException; // Import for handling IO exceptions
import java.io.InputStreamReader; // Import for converting byte streams to character streams

public class ProcessExample {
    public static void startProcess(String command) { // Method to start a process with a given command
        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" ")); // Create a ProcessBuilder to execute command
        try {
            Process process = processBuilder.start(); // Start the process
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream())); // Read output from the process
            String line; // Variable to hold each line of output
            while ((line = reader.readLine()) != null) { // Read until there is no more output
                System.out.println(line); // Print each line of the process output
            }
            int exitCode = process.waitFor(); // Wait for the process to terminate and get the exit code
            System.out.println("Exited with code: " + exitCode); // Print the exit code of the process
        } catch (IOException | InterruptedException e) {
            e.printStackTrace(); // Print the stack trace if an exception occurs
        }
    }

    public static void main(String[] args) {
        startProcess("echo Process 1 started"); // Start the first process
        startProcess("echo Process 2 started"); // Start the second process
    }
}

