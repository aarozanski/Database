package week_8.grades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO studentDao = new StudentDAO();
        studentDao.createTable();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Insert new student");
            System.out.println("2 - Delete a student");
            System.out.println("3 - Update a student's grade");
            System.out.println("4 - List all students");
            System.out.println("5 - Exit");
            System.out.print("Enter option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    studentDao.insertStudent(name, age, grade);
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int id = scanner.nextInt();
                    studentDao.deleteStudent(id);
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    double newGrade = scanner.nextDouble();
                    studentDao.updateStudentGrade(updateId, newGrade);
                    break;
                case 4:
                    studentDao.listAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please enter 1-5.");
                    break;
            }
        }
    }
}
