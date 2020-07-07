import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        boolean isPrime;

        if (number < 2) {
            isPrime = false;
        } else {
            isPrime = true;
            for (int i=2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime",number);
        } else {
            System.out.printf("%d is not a prime", number);
        }
    }
}
