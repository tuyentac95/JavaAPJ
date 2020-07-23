import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.print("Enter " + list.length + " values: ");
        for (int i=0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        insertionSortByStep(list);
        System.out.println("\nSorted list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
    }

    public static void insertionSortByStep(int[] list) {
        for (int i=1; i < list.length; i++) {
            int j = i-1;
            int key = list[i];
            while (j >= 0 && list[j] > key) {
                System.out.print("\nSwap " + list[j] + " with " + key);
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;

            System.out.print("\nList after " + i + " sorting: ");
            for (int value : list) {
                System.out.print(value + "\t");
            }
        }
    }
}
