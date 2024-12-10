package week_2;

public class Person {
    // Declare the fields of the class as private
    private String name;
    private int age;

    // Constructor that initializes the fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for the fields to allow access from outside the class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods to allow safe modification of fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display the name and age
    public void displayDetails() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }
}



