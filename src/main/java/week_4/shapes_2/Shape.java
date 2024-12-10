package week_4.shapes_2;

// Abstract class for shared behaviors of shapes
public abstract class Shape {
    // Abstract methods for area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Non-abstract method to get the type of shape
    public String getShapeType() {
        return this.getClass().getSimpleName(); // Returns the class name as shape type
    }
}

