package week_7.sqlAndFiles_1;

import java.io.Serializable;
/**
 * The ToDo class represents a single task in a to-do list.
 * It implements Serializable to allow tasks to be saved to and read from a file.
 */
public class ToDo implements Serializable {
// properties of this class
    int id;
    String task;
    boolean isComplete;

// constructor for this class. Initializes a new instance of a ToDo object
    public ToDo(int id, String task, boolean isComplete) {
        this.id = id;            // Set the task ID
        this.task = task;        // Set the task description
        this.isComplete = isComplete; // Set the task completion status
    }
  // returns the ID
    public int getId() {
        return id;
    }
  // sets the ID
    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return id + "," + task + "," + isComplete;
    }

}
