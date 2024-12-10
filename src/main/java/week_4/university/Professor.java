package week_4.university;

public abstract class Professor {
    private String name; // Store the name of the professor

    // Constructor to set the name of the professor
    public Professor(String name) {
        this.name = name;
    }

    // Getter for professor's name
    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses to specify how they teach
    public abstract void teachCourse();
}


