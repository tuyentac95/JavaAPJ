import java.util.Scanner;

public class DeleteElement {
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

        for (int i=0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nEnter the element you want to delete: ");
        int delete = scanner.nextInt();
        int position = -1;

        for (int i=0; i < array.length; i++) {
            if (delete == array[i]) {
                position = i;
                break;
            }
        }

        if (position >= 0) {
            for (int i=position; i < array.length - 1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            for (int i=0; i< array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("The array doesn't have " + delete);
        }

    }
}
