package copyfilebinary;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static void copyFileBinary(File source, File dest) throws IOException {
        if (!source.exists()) {
            System.out.println("File input not found!");
            return;
        }

        if (dest.exists()) {
            System.out.println("File output is exists!");
            return;
        }

        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(source);
            outStream = new FileOutputStream(dest);

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer,0,length);
            }

            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //assert inStream != null;
            inStream.close();
            //assert outStream != null;
            outStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileBinary(sourceFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
