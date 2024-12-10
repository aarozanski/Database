package week_4.shapes_2;

// Circle class extends Shape and implements Drawable and Colorable
public class Circle extends Shape implements Drawable, Colorable {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area formula: πr²
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter formula: 2πr
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    public String getColor() {
        return color;
    }
}

