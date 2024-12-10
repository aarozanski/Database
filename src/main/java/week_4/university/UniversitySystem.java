package week_4.university;

/**
 * The Main class is used to run the application and demonstrate the university system.
 * It creates instances of departments, courses, professors, and students, and associates them with each other.
 */
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a new department for Computer Science
        Department csDepartment = new Department("Computer Science");

        // Print to console to confirm creation of the Computer Science department
        System.out.println("Department created: " + csDepartment.getName());

        // Create professors and add them to the Computer Science department
        ProfessorAbstract drSmith = new FullTimeProfessor("Dr. John Smith");
        csDepartment.addProfessor(drSmith);

        // Confirm addition of Dr. Smith to the department
        System.out.println("Professor added: " + drSmith.getName());

        // Create a course called "Data Structures" with 4 credit hours
        Course dataStructures = new Course("Data Structures", 4);

        // Add the course to the Computer Science department
        csDepartment.addCourse(dataStructures);

        // Confirm that the course has been added to the department
        System.out.println("Course added: " + dataStructures.getName());

        // Create students and register them for the "Data Structures" course
        Student janeDoe = new Student("Jane Doe", 101);
        Student johnDoe = new Student("John Doe", 102);

        // Register both students in the "Data Structures" course
        janeDoe.registerCourse(dataStructures);
        johnDoe.registerCourse(dataStructures);

        // Confirm registration of students
        System.out.println("Students registered in " + dataStructures.getName() + ":");
        for (Student student : dataStructures.getStudents()) {
            System.out.println("- " + student.getName());
        }

        // Display all courses and their registered students
        System.out.println("Listing all courses and students in the " + csDepartment.getName() + " department:");
        for (Course course : csDepartment.getCourses()) {
            System.out.println("Course: " + course.getName());
            for (Student student : course.getStudents()) {
                System.out.println(" - " + student.getName());
            }
        }
    }
}

