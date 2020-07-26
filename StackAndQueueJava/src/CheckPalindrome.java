import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    static boolean checkPalindrome(String str) {
        Stack<String> splitString = new Stack<>();
        Queue<String> splitReverseString = new LinkedList<>();
        for (int i=0; i < str.length(); i++) {
            splitString.push(String.valueOf(str.charAt(i)));
            splitReverseString.add(String.valueOf(str.charAt(i)));
        }
        while (!splitString.isEmpty()) {
            if(splitString.pop().compareTo(splitReverseString.poll()) != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcba"));
    }
}
