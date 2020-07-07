import java.util.Scanner;

public class DrawPolygons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        int choice = input.nextInt();

        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Enter width: ");
                    int width = input.nextInt();
                    System.out.println("Enter height: ");
                    int height = input.nextInt();

                    for (int i=0; i<width; i++) {
                        for (int j=0; j<height; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;

                case 2:
                    System.out.println("1. top-left square triangle");
                    System.out.println("2. top-right square triangle");
                    System.out.println("3. bottom-left square triangle");
                    System.out.println("4. bottom-right square triangle");

                    System.out.println("Enter your triangle type: ");
                    int triangle_type = input.nextInt();

                    switch (triangle_type) {
                        case 1:
                            for (int i=0; i<5; i++) {
                                for (int j=5-i; j>0 ;j--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            System.out.print("\n");
                            break;
                        case 2:
                            for (int i=0; i<5; i++) {
                                for (int j=0; j<i; j++) {
                                    System.out.print(" ");
                                }
                                for (int j=5-i; j>0; j--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            System.out.print("\n");
                            break;
                        case 3:
                            for (int i=0; i<5; i++) {
                                for (int j=0; j<=i ;j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            System.out.print("\n");
                            break;
                        case 4:
                            for (int i=0; i<5; i++) {
                                for (int j=5-i; j>1; j--) {
                                    System.out.print(" ");
                                }
                                for (int j=0; j<=i; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            System.out.print("\n");
                            break;
                    }
                    break;
                case 3:
                    for (int i=0; i<4; i++) {
                        for (int j=4-i; j>1; j--) {
                            System.out.print(" ");
                        }
                        for (int j=0; j<(2*i+1); j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;
                default:
                    System.out.println("No choice!");
            }
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
        }
    }
}
