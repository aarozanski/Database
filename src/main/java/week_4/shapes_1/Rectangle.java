package week_4.shapes_1;

// Rectangle class extends Shape
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // Area formula: length × width
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter formula: 2 × (length + width)
    }
}
