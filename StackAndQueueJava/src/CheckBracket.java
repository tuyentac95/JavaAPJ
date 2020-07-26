import java.util.Stack;

public class CheckBracket {
    static boolean checkBracket(String str) {
        Stack<String> bStack = new Stack<>();
        for (int i=0; i < str.length(); i++) {
            String next = String.valueOf(str.charAt(i));
            if (next.compareTo("(") == 0) {
                bStack.push(next);
            }

            if (next.compareTo(")") == 0) {
                bStack.pop();
            }
        }
        return (bStack.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println(checkBracket("((b+a)*c)-(d-e)"));
        System.out.println(checkBracket("((b+a)*c-(d-e)"));
    }
}
