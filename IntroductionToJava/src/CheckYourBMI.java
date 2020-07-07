import java.util.Scanner;

public class CheckYourBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your weight? ");
        double weight = scanner.nextDouble();

        System.out.print("What is your height? ");
        double height = scanner.nextDouble();

        double bmi = weight/(height * height);
        System.out.printf("Your BMI is %f \n",bmi);

        if (bmi < 18.5) {
            System.out.print("You are Underweight");
        } else if (bmi < 25) {
            System.out.print("You are Normal");
        } else if (bmi < 30) {
            System.out.print("You are Overweight");
        } else {
            System.out.print("You are Obese");
        }
    }
}
