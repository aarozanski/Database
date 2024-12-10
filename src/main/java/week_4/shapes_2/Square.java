package week_4.shapes_2;

// Square class extends Rectangle
public class Square extends Rectangle {
    public Square(double side, String color) {
        super(side, side, color); // Pass side as both length and width to Rectangle
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side: " + super.getShapeType());
    }
}

