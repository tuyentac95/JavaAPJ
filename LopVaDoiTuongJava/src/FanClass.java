import java.util.Scanner;

public class FanClass {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.changeSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.changeStatus();

        Fan fan2 = new Fan();
        fan2.changeSpeed(2);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

        fan1.changeStatus();
        fan1.changeSpeed(2);

        fan2.changeStatus();
        fan2.changeSpeed(1);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }

    static class Fan {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        private int speed = SLOW;
        boolean on = false;
        private double radius = 5;
        private String color = "blue";

        Fan() {
        }

        public void changeSpeed(int speed) {
            switch (speed) {
                case 1:
                    this.speed = SLOW;
                    break;
                case 2:
                    this.speed = MEDIUM;
                    break;
                case 3:
                    this.speed = FAST;
                    break;
                default:
                    System.out.println("Unavailable");
            }
        }

        public void changeStatus() {
            this.on = !this.on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            if (this.on) {
                return "speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius + ", status: " + "fan is on";
            } else {
                return "color: " + this.color + ", radius: " + this.radius + ", status: " + "fan is off";
            }
        }
    }
}
