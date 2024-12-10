package week_5.exceptions;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Student> students; // List to store registered students
    private static final int MAX_STUDENTS = 5; // Maximum limit for the course

    public CourseRegistration() {
        this.students = new ArrayList<>();
    }

    // Method to register a student
    public void registerStudent(Student student) throws CustomExceptions.CourseFullException {
        if (students.size() >= MAX_STUDENTS) {
            throw new CustomExceptions.CourseFullException("The course is already full. Maximum 5 students allowed.");
        }
        students.add(student);
        System.out.println("Student registered successfully: " + student.getName());
    }

    // Method to unregister a student
    public void unregisterStudent(String name) throws Exception {
        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (!removed) {
            throw new Exception("Student with name '" + name + "' is not registered in the course.");
        }
        System.out.println("Student unregistered successfully: " + name);
    }

    // Method to list all registered students
    public void listStudents() {
        System.out.println("Registered Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName() + ", Age: " + student.getAge());
        }
    }
}


