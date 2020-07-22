package binarysearch;

public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high)/2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));

//        int[] array = new int[1000000];
//        for (int i=0; i < array.length; i++) {
//            array[i] = i+1;
//        }
//        long start = System.currentTimeMillis();
//        for (int i=0; i < 1000000; i++) {
////            System.out.println(binarySearch(array, 500003));
//            binarySearch(array, 50003);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
    }
}
