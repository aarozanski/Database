package week_4.university;

public class FullTimeProfessor extends ProfessorAbstract {
    // Constructor that passes the name to the superclass
    public FullTimeProfessor(String name) {
        super(name);
    }

    // Implementation of teaching behavior specific to full-time professors
    @Override
    public void teachCourse() {
        System.out.println(getName() + " is teaching full-time.");
    }
}

