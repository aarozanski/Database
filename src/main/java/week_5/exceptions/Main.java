package week_5.exceptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseRegistration course = new CourseRegistration();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Register a student");
            System.out.println("2. Unregister a student");
            System.out.println("3. List all students");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();

                        Student student = new Student(name, age);
                        course.registerStudent(student);
                    } catch (CustomExceptions.InvalidNameException | CustomExceptions.InvalidAgeException | CustomExceptions.CourseFullException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.print("Enter the name of the student to unregister: ");
                        String name = scanner.nextLine();
                        course.unregisterStudent(name);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    course.listStudents();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


