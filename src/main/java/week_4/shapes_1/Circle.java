package week_4.shapes_1;

// Circle class extends Shape
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area formula: πr²
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter formula: 2πr
    }
}
