import java.util.Scanner;

public class CountPassStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }
}
