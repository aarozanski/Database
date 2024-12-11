import java.util.Scanner;

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
                    int age = scanner.nextInt

