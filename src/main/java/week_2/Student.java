package week_2;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private final List<String> enrolledCourses;
    private double tuition;

    // Existing constructor
    public Student(String name, int age, int studentID, String[] enrolledCoursesArray, double tuition) {
        super(name, age);
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
        for (String course : enrolledCoursesArray) this.enrolledCourses.add(course);
        this.tuition = tuition;
    }

    // New constructor
    public Student(String name, int age) {
        super(name, age);
        this.studentID = -1; // Default ID, or handle differently
        this.enrolledCourses = new ArrayList<>();
        this.tuition = 0;
    }

    public void enrollCourses(String[] courses) {
        for (String course : courses) this.enrolledCourses.add(course);
        updateTuition();
    }

    public void enrollCourses(String course) {
        this.enrolledCourses.add(course);
        updateTuition();
    }

    public void updateTuition() {
        this.tuition = this.enrolledCourses.size() * 500;
    }

    public double getTuition() {
        return tuition;
    }
}



