package racingcars;

import java.util.Random;

public class Car implements Runnable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        int DISTANCE = Main.DISTANCE;
        int STEP = Main.STEP;

        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);

                runDistance += speed;

                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i=0; i < 100; i+= STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += this.name.charAt(0);
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + ": \t" + log + " " + Math.min(DISTANCE, runDistance) + "km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " broken...");
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
