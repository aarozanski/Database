package week_7.sqlAndFiles_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoManager {

    public static void saveTasksToFile(String filePath, List<ToDo> tasks) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (ToDo task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<ToDo> loadTasksFromFile(String filePath) {
        List<ToDo> tasks = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String task = parts[1];
                    boolean isComplete = Boolean.parseBoolean(parts[2].trim());
                    tasks.add(new ToDo(id, task, isComplete));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing a number: " + e.getMessage());
        }
        return tasks;
    }

    public static void markTaskAsComplete(int id, String filePath) {
        List<ToDo> tasks = loadTasksFromFile(filePath);
        tasks.forEach(task -> {
            if (task.getId() == id) {
                task.setComplete(true);
            }
        });
        saveTasksToFile(filePath, tasks);
    }

    public static void displayTasks(List<ToDo> tasks) {
        tasks.forEach(task ->
                System.out.println("ID: " + task.getId() + ", Task: " + task.getTask() + ", Complete: " + task.isComplete())
        );
    }

    public static void main(String[] args) {
        String filePath = "tasks.txt";
        List<ToDo> tasks = new ArrayList<>();

        // Creating sample tasks
        tasks.add(new ToDo(1, "Buy groceries", false));
        tasks.add(new ToDo(2, "Finish homework", false));
        tasks.add(new ToDo(3, "Call the bank", true));

        saveTasksToFile(filePath, tasks);

        List<ToDo> loadedTasks = loadTasksFromFile(filePath);
        System.out.println("Tasks loaded from file:");
        displayTasks(loadedTasks);

        markTaskAsComplete(2, filePath);

        loadedTasks = loadTasksFromFile(filePath);
        System.out.println("After marking task 2 as complete:");
        displayTasks(loadedTasks);
    }
}


