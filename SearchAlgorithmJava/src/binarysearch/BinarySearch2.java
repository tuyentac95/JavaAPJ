package binarysearch;

public class BinarySearch2 {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    static int binarySearch(int[] list,int low, int high, int key) {
        if (high < low) return -1;
        int mid = (high + low)/2;
        if (list[mid] == key) return mid;
        if (list[mid] > key) return binarySearch(list, low, mid - 1, key);
        return binarySearch(list, mid+1, high, key);
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 0, list.length-1, 2));
        System.out.println(binarySearch(list, 0, list.length-1, 11));
        System.out.println(binarySearch(list, 0, list.length-1, 79));
        System.out.println(binarySearch(list, 0, list.length-1, 1));
        System.out.println(binarySearch(list, 0, list.length-1, 5));
        System.out.println(binarySearch(list, 0, list.length-1, 80));
    }
}
