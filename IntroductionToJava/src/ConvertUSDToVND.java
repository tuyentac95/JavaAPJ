import java.util.Scanner;

public class ConvertUSDToVND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the exchange rate of USD/VND: ");
        double usd_vnd = scanner.nextDouble();

        System.out.print("Enter USD: ");
        double usd = scanner.nextDouble();

        double vnd = usd * usd_vnd;
        System.out.printf("%.2f USD is equal to %.2f",usd,vnd);
    }
}
