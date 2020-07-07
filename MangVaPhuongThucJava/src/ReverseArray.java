import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        int[] array = new int[size];
        int i=0;
        while (i < array.length) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j=0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j=0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 - j] = temp;
        }

        System.out.printf("%-20s%s","\nReverse array: ", "");
        for (int j=0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
