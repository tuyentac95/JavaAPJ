package simplethread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1);
        thread1.setPriority(1);

        Thread thread2 = new Thread(generator2);
        thread2.setPriority(5);


        thread1.start();
        thread2.start();
    }
}
