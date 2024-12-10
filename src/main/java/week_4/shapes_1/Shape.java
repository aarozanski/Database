package week_4.shapes_1;

// Abstract class for common shape behaviors
public abstract class Shape {
    public abstract double calculateArea(); // Abstract method for area
    public abstract double calculatePerimeter(); // Abstract method for perimeter

    // Method to return the type of the shape
    public String getShapeType() {
        return this.getClass().getSimpleName(); // Gets the class name
    }
}






