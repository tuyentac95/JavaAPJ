package readfilecsv;

import java.io.*;

public class CSVReader {
    public static void main(String[] args) {
        File file = new File("IOTextFileJava\\src\\readfilecsv\\country.csv");
        String csvFile = file.getAbsolutePath();
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] country = line.split(csvSplitBy);
                System.out.println("Country [code=" + country[4] + ", name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
