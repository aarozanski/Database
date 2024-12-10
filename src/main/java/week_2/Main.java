package week_2;

public class Main {
    public static void main(String[] args) {
        // Create a CourseManager object
        CourseManager courseManager = new CourseManager();

        // Create Student objects
        Student adinai = new Student("Adinai", 21, 1, new String[]{}, 0);
        Student yasmin = new Student("Yasmin", 14, 2, new String[]{}, 0);
        Student aisun = new Student("Aisun", 10, 3, new String[]{}, 0);

        // Add students to the CourseManager
        courseManager.addStudent(adinai);
        courseManager.addStudent(yasmin);
        courseManager.addStudent(aisun);

        // Enroll students in courses
        adinai.enrollCourses(new String[] {"Math", "Science", "Computer Science"});
        yasmin.enrollCourses("History");
        aisun.enrollCourses(new String[] {"Economics", "Art"});

        // Update tuition based on courses enrolled
        adinai.updateTuition();
        yasmin.updateTuition();
        aisun.updateTuition();

        // Display student tuition details
        System.out.println(adinai.getName() + " - Tuition: $" + adinai.getTuition());
        System.out.println(yasmin.getName() + " - Tuition: $" + yasmin.getTuition());
        System.out.println(aisun.getName() + " - Tuition: $" + aisun.getTuition());

        // Display details of all enrolled students
        courseManager.displayAllStudents();
    }
}

