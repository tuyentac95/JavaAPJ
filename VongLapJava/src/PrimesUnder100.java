import java.util.Scanner;

public class PrimesUnder100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();

        for (int i=2; i<limit; i++) {
            boolean isPrime = true;
            for (int j=2; j<=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i+" ");
            }
        }
    }
}
