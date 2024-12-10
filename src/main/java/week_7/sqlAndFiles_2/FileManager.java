package week_7.sqlAndFiles_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    // Save the list of students to a file
    public static void saveStudentsToFile(String filePath, List<Student> students) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
        }
    }

    // Load the list of students from a file
    public static List<Student> loadStudentsFromFile(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double grade = Double.parseDouble(parts[2]);
                    students.add(new Student(id, name, grade));
                }
            }
        }
        return students;
    }

    // Display the list of students
    public static void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Grade: " + student.getGrade());
        }
    }
    // Update a student's grade by their ID
    public static void updateGrade(int id, double newGrade, String filePath) throws IOException {
        List<Student> students = loadStudentsFromFile(filePath);
        for (Student student : students) {
            if (student.getId() == id) {
                student.setGrade(newGrade);
                break;
            }
        }
        saveStudentsToFile(filePath, students);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        String filePath = "students.txt";
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "John Doe", 88.5));
        students.add(new Student(102, "Jane Smith", 92.0));
        students.add(new Student(103, "Emily White", 76.3));

        try {
            saveStudentsToFile(filePath, students);
            List<Student> loadedStudents = loadStudentsFromFile(filePath);
            System.out.println("Loaded Students:");
            displayStudents(loadedStudents);

            updateGrade(102, 95.0, filePath);
            System.out.println("Updated Grades:");
            loadedStudents = loadStudentsFromFile(filePath);
            displayStudents(loadedStudents);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

