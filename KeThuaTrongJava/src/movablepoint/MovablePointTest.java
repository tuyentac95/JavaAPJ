package movablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        point.setX(2.1f);
        point.setY(4.9f);
        point.setSpeed(0.5f, -0.5f);
        System.out.println("Point: " + point);
        System.out.println("Point after move: " + point.move());
    }

}
