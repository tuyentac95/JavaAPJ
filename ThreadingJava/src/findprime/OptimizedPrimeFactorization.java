package findprime;

public class OptimizedPrimeFactorization extends Thread{
    private final int number = 2000;

    @Override
    public void run() {
        for (int i=2; i <= number; i++) {
            boolean check = true;
            for (int j=2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("OptimizedFactorization found " + i);
            }
        }
    }
}
