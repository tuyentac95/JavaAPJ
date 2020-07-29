package racingcars;

public class Main {
    public static int DISTANCE = 250;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("porsche");
        Car carB = new Car("bugatti");
        Car carC = new Car("ferrari");

        Thread threadA = new Thread(carA);
        Thread threadB = new Thread(carB);
        Thread threadC = new Thread(carC);

        System.out.println("Distance: " + DISTANCE + "km");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
