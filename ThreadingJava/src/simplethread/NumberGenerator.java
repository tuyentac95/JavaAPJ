package simplethread;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i=1; i <= 10; i++) {
            System.out.println(i);
            System.out.println(hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
