package copyfile;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) {
        try {
            File file1 = new File("IOTextFileJava\\src\\copyfile\\file1.txt");
            File file2 = new File("IOTextFileJava\\src\\copyfile\\file2.txt");

            BufferedReader brRead = new BufferedReader(new FileReader(file1));
            BufferedWriter brWrite = new BufferedWriter(new FileWriter(file2));

            String line = "";
            int count = 0;

            while ((line = brRead.readLine()) != null) {
                count += line.length();
                brWrite.write(line + "\n");
            }

            brRead.close();
            brWrite.close();

            System.out.println("Done");
            System.out.println("Number of char: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
