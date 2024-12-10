package week_3.management;

// This class represents a single contact with a name, phone number, and email.
class Contact {
    // Private variables to store contact information
    private final String name;           // Stores the contact's name
    private String phoneNumber;     // Stores the contact's phone number
    private final String email;           // Stores the contact's email address

    // Constructor: This method is called when we create a new Contact.
    // It sets the name, phone number, and email of the contact.
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;                   // Sets the contact's name
        this.phoneNumber = phoneNumber;     // Sets the contact's phone number
        this.email = email;                 // Sets the contact's email address
    }

    // Getter for name: This method returns the contact's name.
    public String getName() {
        return name;
    }

    // Getter for phone number: This method returns the contact's phone number.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter for phone number: This method allows updating the contact's phone number.
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;     // Updates the contact's phone number
    }

    // Getter for email: This method returns the contact's email address.
    public String getEmail() {
        return email;
    }

    // toString method: This method returns a string with all the contact's information.
    // When we print the contact, this is the format it will show in.
    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}


