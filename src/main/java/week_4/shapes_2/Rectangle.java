package week_4.shapes_2;

// Rectangle class extends Shape and implements Drawable and Colorable
public class Rectangle extends Shape implements Drawable, Colorable {
    private double length, width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return length * width; // Area formula: length × width
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Perimeter formula: 2 × (length + width)
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + ", width: " + width);
    }

    @Override
    public String getColor() {
        return color;
    }
}

