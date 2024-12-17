package week_10.server;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // The server's hostname or IP address
        int port = 5000; // The port that the server is listening on

        // Try-with-resources to ensure that the socket is closed properly
        try (Socket socket = new Socket(hostname, port)) {
            // PrintWriter to send data to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // BufferedReader to read data from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a message to the server
            out.println("Hello from client!");

            // Read the response from the server
            String response = in.readLine();
            System.out.println("Server response: " + response);
        } catch (UnknownHostException e) {
            // Handle errors in finding the server
            System.out.println("Server not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle other I/O errors
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}

