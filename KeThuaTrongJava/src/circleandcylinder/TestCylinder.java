package circleandcylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println(circle1);

        circle1 = new Circle1(5.0, "blue");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(4.0,"white",3.0);
        System.out.println(cylinder);
    }
}
