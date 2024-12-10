package week_4.university;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name; // Store the student's name
    private int studentId; // Store the student ID
    private List<Course> courses; // List to store registered courses

    // Constructor to initialize the student with name and ID
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>(); // Initialize the list of courses
    }

    // Method to register the student for a course
    public void registerCourse(Course course) {
        courses.add(course); // Add the course to the student's list
        course.addStudent(this); // Add the student to the course's list
    }

    // Getter for student's name
    public String getName() {
        return name;
    }

    // Getter for list of courses student is registered in
    public List<Course> getCourses() {
        return courses;
    }
}

