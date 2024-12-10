package week_4.shapes_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list of shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add different shapes to the list
        shapes.add(new Circle(5)); // Circle with radius 5
        shapes.add(new Rectangle(4, 6)); // Rectangle with length 4 and width 6
        shapes.add(new Square(4)); // Square with side 4

        // Loop through the shapes and calculate area and perimeter
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getShapeType());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}


