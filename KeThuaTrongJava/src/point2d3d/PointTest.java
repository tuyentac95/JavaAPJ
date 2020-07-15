package point2d3d;

public class PointTest {
    public static void main(String[] args) {
        Point2D point_1 = new Point2D();
        System.out.println("Point 1: " + point_1);

        point_1.setX(5.7f);
        point_1.setY(2.1f);
        System.out.println("Point 1 after: " + point_1);

        Point2D point_2 = new Point2D(3.5f, 7.2f);
        System.out.println("\nPoint 2: " + point_2);

        point_2.setXY(1.2f,6.6f);
        System.out.println("Point 2 after: " + point_2);

        Point3D point_3 = new Point3D();
        System.out.println("\nPoint 3: " + point_3);

        point_3.setX(3.9f);
        point_3.setY(10.2f);
        point_3.setZ(42f);
        System.out.println("Point 3 after: " + point_3);

        Point3D point_4 = new Point3D(5.9f, 2.2f, -24.3f);
        System.out.println("\nPoint 4: " + point_4);

        point_4.setXYZ(-21f, 0f, 53.7f);
        System.out.println("Point 4 after: " + point_4);


    }


}
