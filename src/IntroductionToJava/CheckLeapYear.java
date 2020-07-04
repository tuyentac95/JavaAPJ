package IntroductionToJava;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Which year do you want to check? ");
        int year = scanner.nextInt();
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else {
                isLeapYear = year % 400 == 0;
            }
        } else isLeapYear = false;

        if (isLeapYear) {
            System.out.printf("The year %d is a leap year",year);
        } else {
            System.out.printf("The year %d is not a leap year", year);
        }
    }
}
