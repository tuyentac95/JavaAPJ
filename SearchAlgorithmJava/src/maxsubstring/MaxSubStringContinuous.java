package maxsubstring;

import java.util.Scanner;

public class MaxSubStringContinuous {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String now = Character.toString(str.charAt(0));
        String max = now;

        for (int i=1; i < str.length(); i++) {
            if (str.charAt(i) > now.charAt(now.length()-1)) {
                now += Character.toString(str.charAt(i));

            } else {
                now = Character.toString(str.charAt(i));
            }
            if (now.length() > max.length()) {
                max = now;
            }
        }

        System.out.println(max);
    }
}
