package week_10.server;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 5001; // Server will listen on this port.

        // Try-with-resources to ensure that the server socket is closed properly
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started, waiting for clients...");

            // Infinite loop to keep the server running
            while (true) {
                // Accept a connection from a client
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Client connected.");

                    // BufferedReader to read data from the client
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    // PrintWriter to send data to the client
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                    // Read a line of text from the client
                    String message = in.readLine();
                    System.out.println("Received from client: " + message);

                    // Echo the message back to the client
                    out.println("Echo from server: " + message);
                } catch (IOException e) {
                    // Handle exceptions with client connections
                    System.out.println("Exception occurred with a client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            // Handle exceptions when setting up the server
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}

