import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    static String convertDecimalToBinary(int decimal) {
        String binary = "";
        Stack<String> bit = new Stack<>();
        while (decimal > 0) {
            bit.push(String.valueOf(decimal % 2));
            decimal /= 2;
        }
        while (!bit.isEmpty()) {
            binary += bit.pop();
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        System.out.println(decimal + " in binary is " + convertDecimalToBinary(decimal));
    }
}
