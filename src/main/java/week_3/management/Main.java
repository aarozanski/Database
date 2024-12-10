package week_3.management;

import java.util.Scanner;    // Import Scanner for reading user input

// Main class to run the Contact Manager program with a menu for user interaction
public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();   // Create a ContactManager instance
        Scanner scanner = new Scanner(System.in);               // Create a Scanner for reading user input

        // Infinite loop to keep displaying the menu until the user chooses to exit
        while (true) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Remove Contact");
            System.out.println("5. Display Unique Email Domains");
            System.out.println("6. Exit");

            // Prompt the user to enter a choice
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();        // Read the user's menu choice
            scanner.nextLine();                    // Consume the newline character

            // Process the user's choice using a switch statement
            switch (choice) {
                case 1:
                    // Option 1: Add a new contact
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contactManager.addContact(name, phoneNumber, email);    // Add the contact
                    break;

                case 2:
                    // Option 2: Display all contacts
                    contactManager.displayContacts();    // Call method to display contacts
                    break;

                case 3:
                    // Option 3: Search for a contact by name
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    contactManager.searchContact(name);  // Call method to search for the contact
                    break;

                case 4:
                    // Option 4: Remove a contact by name
                    System.out.print("Enter name to remove: ");
                    name = scanner.nextLine();
                    contactManager.removeContact(name);  // Call method to remove the contact
                    break;

                case 5:
                    // Option 5: Display all unique email domains
                    contactManager.displayUniqueDomains();   // Call method to display unique domains
                    break;

                case 6:
                    // Option 6: Exit the program
                    System.out.println("Exiting...");
                    scanner.close();                        // Close the scanner
                    System.exit(0);                         // Exit the program

                default:
                    // If user enters an invalid option
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
