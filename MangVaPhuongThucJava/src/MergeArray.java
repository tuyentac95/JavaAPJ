import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size_1;
        do {
            System.out.print("Enter size of array 1: ");
            size_1 = scanner.nextInt();
            if (size_1 > 10) {
                System.out.println("The size is too big!");
            }
        } while (size_1 > 10);

        int[] array_1 = new int[size_1];
        for (int i=0; i < size_1; i++) {
            System.out.print("Enter the element " + i + " : ");
            array_1[i] = scanner.nextInt();
        }
        System.out.println("The array 1 is: ");
        for (int i=0; i< size_1; i++) {
            System.out.print(array_1[i] + " ");
        }

        int size_2;
        do {
            System.out.print("\nEnter size of array 2: ");
            size_2 = scanner.nextInt();
            if (size_2 > 10) {
                System.out.println("The size is too big!");
            }
        } while (size_2 > 10);

        int[] array_2 = new int[size_2];
        for (int i=0; i < size_2; i++) {
            System.out.print("Enter the element " + i + " : ");
            array_2[i] = scanner.nextInt();
        }
        System.out.println("The array 2 is: ");
        for (int i=0; i< size_2; i++) {
            System.out.print(array_2[i] + " ");
        }

        int[] array_3 = new int[size_1 + size_2];
        for (int i=0; i < size_1; i++) {
            array_3[i] = array_1[i];
        }
        for (int i=0; i < size_2; i++) {
            array_3[size_1 + i] = array_2[i];
        }
        System.out.println("\nThe array 3 is: ");
        for (int value : array_3) {
            System.out.print(value + " ");
        }
    }
}
