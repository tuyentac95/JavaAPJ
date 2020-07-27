package copyfile;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outSteam = null;
        try {
            inStream = new FileInputStream(new File("E:\\Codegym\\Java APJ\\IOTextFileJava\\src\\copyfile\\file1.txt"));
            outSteam = new FileOutputStream(new File("E:\\Codegym\\Java APJ\\IOTextFileJava\\src\\copyfile\\file2.txt"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outSteam.write(buffer,0,length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outSteam.close();
        }
    }
}
