package VongLapJava;

import java.util.Scanner;

public class FirstPrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of First Primes: ");
        int number = input.nextInt();

        int count = 0;
        for (int i=2; count<number; i++) {
            boolean isPrime = true;
            for (int j=2; j<=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i+" ");
                count++;
            }
        }
    }
}
