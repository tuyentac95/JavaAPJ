import java.util.Scanner;

public class QuadraticEquationClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        do {
            System.out.print("Enter a: ");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("a cannot equal to 0");
            }
        } while (a == 0);

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double discriminant = quadraticEquation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The equation has 2 roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has 1 root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has 0 root");
        }
    }

    static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation() {
        }

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return this.a;
        }

        public double getB() {
            return this.b;
        }

        public double getC() {
            return this.c;
        }

        public double getDiscriminant() {
            return (this.b * this.b) - 4 * (this.a * this.c);
        }

        public double getRoot1() {
            if (this.getDiscriminant() >= 0) {
                return (-this.b + Math.pow(this.getDiscriminant(),0.5)) / (2 * this.a);
            }
            return 0;
        }

        public double getRoot2() {
            if (this.getDiscriminant() >= 0) {
                return (-this.b - Math.pow(this.getDiscriminant(),0.5)) / (2 * this.a);
            }
            return 0;
        }

    }
}
