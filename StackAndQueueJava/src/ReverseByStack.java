import java.util.Stack;

public class ReverseByStack {
    public static void main(String[] args) {
        Stack<Integer> reverseIntArray = new Stack<>();
        int[] intArray = {1,2,3,4,5};

        for (int value : intArray) {
            reverseIntArray.push(value);
        }
        for (int i=0; i < intArray.length; i++) {
            intArray[i] = reverseIntArray.pop();
        }
        for (int value : intArray) {
            System.out.print(value + " ");
        }

        System.out.println();

        Stack<String> reverseString = new Stack<>();
        String string = "abcdefg";

        for (int i=0; i < string.length(); i++) {
            reverseString.push(Character.toString(string.charAt(i)));
        }

        String newString = "";
        for (int i=0; i < string.length(); i++) {
            newString += reverseString.pop();
        }
        string = newString;

        System.out.println(string);

    }
}
