import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("The size is too big!");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i=0; i < size; i++) {
            System.out.print("Enter the element " + i + " : ");
            array[i] = scanner.nextInt();
        }

        for (int i=0; i< size; i++) {
            System.out.print(array[i] + " ");
        }

        int minArray = array[0];
        for (int i=0; i < array.length; i++) {
            if (array[i] < minArray) {
                minArray = array[i];
            }
        }

        System.out.println("\nThe minimum in array is " + minArray);
    }
}
