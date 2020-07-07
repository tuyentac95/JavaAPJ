import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter size of array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        int[] array = new int[size];
        for (int i=0; i < array.length; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int position = 1;
        for (int i=0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                position = i+1;
            }
        }

        System.out.println("The largest property value in the list is " + max + " at position " + position);
    }

}
