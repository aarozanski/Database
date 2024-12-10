package week_3.management;

import java.util.ArrayList;   // Imports ArrayList for storing multiple contacts
import java.util.HashMap;     // Imports HashMap for quick lookups by name
import java.util.HashSet;     // Imports HashSet for storing unique email domains

// This class manages a list of contacts and allows adding, searching, and removing contacts.
public class ContactManager {
    // List of all contacts
    private final ArrayList<Contact> contacts = new ArrayList<>();

    // Map to quickly find a contact's phone number by name
    private final HashMap<String, String> contactPhoneLookup = new HashMap<>();

    // Set to store unique email domains (e.g., "gmail.com", "yahoo.com")
    private final HashSet<String> uniqueEmailDomains = new HashSet<>();

    // Method to add a new contact to the manager
    public void addContact(String name, String phoneNumber, String email) {
        // Check if a contact with the same name already exists
        if (contactPhoneLookup.containsKey(name.toLowerCase())) {
            System.out.println("A contact with this name already exists.");
            return;
        }

        // Create a new Contact object
        Contact newContact = new Contact(name, phoneNumber, email);

        // Add the contact to the ArrayList
        contacts.add(newContact);

        // Add the contact's phone number to the HashMap for quick lookup by name
        contactPhoneLookup.put(name.toLowerCase(), phoneNumber);

        // Extract the domain from the email and add it to the HashSet for unique domains
        String domain = getDomainFromEmail(email);
        uniqueEmailDomains.add(domain);

        System.out.println("Contact added successfully!");
    }

    // Method to display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            System.out.println("Contact List:");
            // Loop through each contact in the ArrayList and print it
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    // Method to search for a contact by name and display their phone number
    public void searchContact(String name) {
        // Use the HashMap to quickly find the phone number by name
        String phoneNumber = contactPhoneLookup.get(name.toLowerCase());

        if (phoneNumber != null) {
            System.out.println("Phone Number for " + name + ": " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Method to remove a contact by name
    public void removeContact(String name) {
        boolean found = false;

        // Loop through the ArrayList to find the contact by name
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                // Remove the contact from the ArrayList
                contacts.remove(i);

                // Remove the contact from the HashMap
                contactPhoneLookup.remove(name.toLowerCase());

                found = true;  // Indicate that the contact was found and removed
                break;
            }
        }

        if (found) {
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Method to display all unique email domains
    public void displayUniqueDomains() {
        if (uniqueEmailDomains.isEmpty()) {
            System.out.println("No unique domains to display.");
        } else {
            System.out.println("Unique Email Domains:");
            // Loop through each unique domain in the HashSet and print it
            for (String domain : uniqueEmailDomains) {
                System.out.println(domain);
            }
        }
    }

    // Helper method to extract the domain part from an email address
    private String getDomainFromEmail(String email) {
        int atIndex = email.indexOf('@');            // Find the position of '@' in the email
        return email.substring(atIndex + 1);         // Return the substring after '@'
    }
}




