package findprime;

import java.util.Scanner;

public class FindPrimeTest {
    public static void main(String[] args) {
        Thread lazyThread = new LazyPrimeFactorization();
        Thread optimizedThread = new OptimizedPrimeFactorization();

        System.out.println("Find primes under number: ");
        lazyThread.start();
        optimizedThread.start();
    }
}
