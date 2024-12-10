package week_2;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final List<Student> students;

    // Constructor
    public CourseManager() {
        this.students = new ArrayList<>(); // Initialize the list
    }

    // Method to add a student to the list
    public void addStudent(Student student) {
        this.students.add(student); // Correctly add a Student object to the list
    }

    // Method to display the details of all students
    public void displayAllStudents() {
        System.out.println("List of all students:");
        for (Student student : students) {
            student.displayDetails(); // Correct invocation of displayDetails method
        }
    }
}

