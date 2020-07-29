package oddandeven;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();

        oddThread.start();
        oddThread.join();
        evenThread.start();
    }
}
