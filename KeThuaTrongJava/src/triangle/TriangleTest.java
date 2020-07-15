package triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input side 1: ");
        double side1 = sc.nextInt();

        System.out.print("Input side 2: ");
        double side2 = sc.nextInt();

        System.out.print("Input side 3: ");
        double side3 = sc.nextInt();

        sc.nextLine();

        System.out.print("Input color: ");
        String color = sc.nextLine();

        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);

        System.out.println("\n"+triangle);
    }
}
