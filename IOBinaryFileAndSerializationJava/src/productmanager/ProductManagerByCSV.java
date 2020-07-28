package productmanager;

import java.io.*;

public class ProductManagerByCSV {
    private static File productList;

    public ProductManagerByCSV() throws IOException {
        productList = new File("IOBinaryFileAndSerializationJava\\src\\productmanager\\productList.csv");
    }

    public void addProduct(Product product) throws IOException {
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(productList,true));
        String[] info = product.infoToString();
        bWriter.write(info[0]);
        for (int i=1; i < info.length; i++) {
            bWriter.write("," + info[i]);
        }
        bWriter.write("\n");
        bWriter.flush();
    }

    public void display() throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(productList));
        System.out.println("===== Product List: =====");
        String line = "";
        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void search(String id) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(productList));
        System.out.println("===== Find product =====");
        String line = "";
        while ((line = bReader.readLine()) != null) {
            String[] info = line.split(",");
            if (info[0].compareTo(id) == 0) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ProductManagerByCSV productManager = new ProductManagerByCSV();

        Product product1 = new Product("A001","Book","ABC",50000,"red");
        Product product2 = new Product("A002","Notebook","AAA",10000,"yellow");
        Product product3 = new Product("B004","Pen","BBB",2000,"blue");

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        productManager.display();

        productManager.search("A001");
    }
}
