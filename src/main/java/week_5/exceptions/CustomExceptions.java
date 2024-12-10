package week_5.exceptions;

public class CustomExceptions {

    // Exception for invalid age
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Exception for invalid name
    public static class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    // Exception for course full
    public static class CourseFullException extends Exception {
        public CourseFullException(String message) {
            super(message);
        }
    }
}

