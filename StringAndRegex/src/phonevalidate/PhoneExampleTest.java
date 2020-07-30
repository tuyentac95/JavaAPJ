package phonevalidate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneExampleTest {
    public static void main(String[] args) throws IOException {
        PhoneExample phoneExample = new PhoneExample();

        String[] validPhone = {"(84)-(0383071907)","(35)-(0123456789)"};
        String[] invalidPhone = {"(0123456789)","(085)-(91249876)","(54)-(1234567890)"};

        for (String phone : validPhone) {
            boolean isValid = phoneExample.validate(phone);
            System.out.println("Phone " + phone + " is valid: " + isValid);
        }

        for (String phone : invalidPhone) {
            boolean isValid = phoneExample.validate(phone);
            System.out.println("Phone " + phone + " is valid: " + isValid);
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number phone: ");
        String phone = bufferedReader.readLine();

        boolean isValid = phoneExample.validate(phone);
        System.out.println("Phone " + phone + " is valid: " + isValid);
    }
}
