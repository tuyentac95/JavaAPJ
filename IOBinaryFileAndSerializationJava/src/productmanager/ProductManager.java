package productmanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProductManager {
    private static File productList;
    private static BufferedWriter bWriter;


    public ProductManager() throws IOException {
        productList = new File("IOBinaryFileAndSerialiationJava\\src\\productmanager\\productList.csv");
        bWriter = new BufferedWriter(new FileWriter(productList));
    }

    public void addProduct(Product product) throws IOException {
        String[] info = product.infoToString();
        bWriter.write(info[0]);
        for (int i=1; i < info.length; i++) {
            bWriter.write("," + info[i]);
        }
        bWriter.close();
    }

    public static void main(String[] args) throws IOException {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product("A001","Book","ABC",50000,"red");
        productManager.addProduct(product1);
    }
}
