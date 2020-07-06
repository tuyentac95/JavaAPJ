package VongLapJava;

import java.util.Scanner;

public class FindDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = Math.abs(scanner.nextInt());
        System.out.print("Enter b: ");
        int b = Math.abs(scanner.nextInt());

        if (a == 0 || b == 0) {
            System.out.print("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
