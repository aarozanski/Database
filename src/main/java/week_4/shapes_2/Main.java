package week_4.shapes_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a list of shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add shapes to the list
        shapes.add(new Circle(5, "Red")); // Circle with radius 5 and color Red
        shapes.add(new Rectangle(4, 6, "Blue")); // Rectangle with length 4, width 6, color Blue
        shapes.add(new Square(4, "Green")); // Square with side 4 and color Green

        // Demonstrate polymorphism
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getShapeType());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

            // Call the draw() method if the shape is drawable
            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }

            // Display color if the shape is colorable
            if (shape instanceof Colorable) {
                System.out.println("Color: " + ((Colorable) shape).getColor());
            }
            System.out.println();
        }
    }
}

