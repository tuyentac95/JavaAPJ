import java.util.Date;

public class StopWatchClass {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i=0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 1000000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i=0; i < array.length; i++) {
            int min = array[i];
            int position = i;
            for (int j=i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    position = j;
                }
            }
            int temp = array[i];
            array[i] = array[position];
            array[position] = temp;
        }

        stopWatch.stop();
        System.out.println("The time is: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    static class StopWatch {
        long startTime;
        long endTime;

        public long getStartTime() {
            return this.startTime;
        }
        public  long getEndTime() {
            return this.endTime;
        }

        StopWatch() {
            this.startTime = new Date().getTime();
        }

        public void start() {
            this.startTime = new Date().getTime();
        }
        public void stop() {
            this.endTime = new Date().getTime();
        }
        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }
}
