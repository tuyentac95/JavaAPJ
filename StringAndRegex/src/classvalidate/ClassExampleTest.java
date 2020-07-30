package classvalidate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ClassExampleTest {
    public static void main(String[] args) throws IOException {
        ClassExample classExample = new ClassExample();

        String[] validName = {"C0318G","A3087H","P2549K"};
        String[] invalidName = {"M0138G","O987","MN0123G","A0987B"};

        for (String name : validName) {
            System.out.println("Class's name " + name + " is valid: " + classExample.validate(name));
        }

        for (String name : invalidName) {
            System.out.println("Class's name " + name + " is valid: " + classExample.validate(name));
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter class's name: ");
        String className = bufferedReader.readLine();

        System.out.println("Class's name " + className + "is valid: " + classExample.validate(className));
    }
}
