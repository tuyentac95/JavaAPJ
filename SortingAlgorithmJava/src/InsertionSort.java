public class InsertionSort {
    static int[] list = {9,3,2,5,4,8,7,10,6,1};

    public static void insertionSort(int[] list) {
        for (int i=1; i < list.length; i++) {
            int j = i-1;
            int key = list[i];
            while (j >= 0 && list[j] > key) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println("List before sorting: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        insertionSort(list);
        System.out.println("\nList after sorting: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
    }
}
