public class FindMinByMethod {
    public static void main(String[] args) {
        int[] array = {4, 12, 7, 8, 97, 6, 9};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i=0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
