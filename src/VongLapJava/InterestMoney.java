package VongLapJava;

import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much do you want to lend: ");
        double money = scanner.nextDouble();

        System.out.print("How long do you want to lend (month): ");
        double month = scanner.nextInt();

        System.out.print("Enter the interest rate (%/year): ");
        double interest_rate = scanner.nextDouble();

        double interest = money * (Math.pow((1+interest_rate/100), (month/12)) - 1);
        System.out.printf("The total interest is %.2f",interest);
    }
}
