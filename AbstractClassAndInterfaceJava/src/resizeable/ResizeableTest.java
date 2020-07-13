package resizeable;

import comparator.Circle;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        Square square = new Square(4.7,"indigo");
        Rectangle rectangle = new Rectangle(8.5, 3.6,"pink");

        System.out.println("Pre-resize: ");
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        circle.resize(50);
        square.resize(120);
        rectangle.resize(20);

        System.out.println("\nAfter-resize: ");
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
