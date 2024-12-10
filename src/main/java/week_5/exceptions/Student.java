package week_5.exceptions;

// Student Class
public class Student {
    private String name;
    private int age;

    // Constructor to initialize name and age with validation
    public Student(String name, int age) throws CustomExceptions.InvalidNameException, CustomExceptions.InvalidAgeException {
        if (name == null || name.trim().isEmpty()) {
            throw new CustomExceptions.InvalidNameException("Name cannot be null or empty.");
        }
        if (age < 18 || age > 60) {
            throw new CustomExceptions.InvalidAgeException("Age must be between 18 and 60.");
        }
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


