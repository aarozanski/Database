package week_8.grades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.initializeDatabase(); // Ensure this method creates the table

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        CreateTable.createNewTable(); // Method that creates the table if it doesn't exist

        while (running) {
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
                    InsertData.insert(name, age, grade);
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int id = scanner.nextInt();
                    DeleteData.delete(id);
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    double newGrade = scanner.nextDouble();
                    UpdateData.update(updateId, newGrade);
                    break;
                case 4:
                    RetrieveData.selectAll();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1-5.");
                    break;
            }
        }
        scanner.close();
    }
}


