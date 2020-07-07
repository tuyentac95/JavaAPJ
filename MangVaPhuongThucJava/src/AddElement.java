import java.util.Scanner;

public class AddElement {
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

        int[] array = new int[size+1];
        for (int i=0; i < size; i++) {
            System.out.print("Enter the element " + i + " : ");
            array[i] = scanner.nextInt();
        }

        for (int i=0; i< size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nEnter the element you want to add: ");
        int add = scanner.nextInt();
        System.out.print("\nEnter the position of this element: ");
        int position = scanner.nextInt();

        if (position < 0 || position > array.length-1) {
            System.out.println("Cannot add element to this position!");
        } else {
            for (int i = array.length-1; i > position; i--) {
                array[i] = array[i-1];
            }
            array[position] = add;
            for (int i=0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
