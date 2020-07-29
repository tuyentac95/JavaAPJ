package productmanager;

import java.io.*;
import java.util.ArrayList;

public class ProductManagerByBinary {
    public static void main(String[] args) {
        final String PATH = "IOBinaryFileAndSerializationJava\\src\\productmanager\\listProduct.txt";
        ProductManagerByBinary productManager = new ProductManagerByBinary(PATH);

        Product product1 = new Product("A001","Book","ABC",50000,"red");
        Product product2 = new Product("A002","Notebook","AAA",10000,"yellow");
        Product product3 = new Product("B004","Pen","BBB",2000,"blue");

        productManager.addProduct(product1);
        productManager.addProduct(product2);

        try {
            productManager.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        productManager.display();

        productManager.addProduct(product3);

        try {
            productManager.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        productManager.display();

        productManager.searchProduct("B004");
        productManager.searchProduct("A005");

        ArrayList<Product> newList = null;

        try {
            newList = productManager.readFile();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("==== New List ===");
        for (Product product : newList) {
            System.out.println(product);
        }

    }

    private static File fileProduct;
    private static ArrayList<Product> listProduct;

    public ProductManagerByBinary() {
    }

    public ProductManagerByBinary(String path) {
        fileProduct = new File(path);
        listProduct = new ArrayList<>();
    }

    public void writeFile() throws IOException {
        FileOutputStream fileOS = new FileOutputStream(fileProduct);
        ObjectOutputStream objectOS = new ObjectOutputStream(fileOS);
        for (Product product : listProduct) {
            objectOS.writeObject(product);
        }
    }

    public ArrayList<Product> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fileIS = new FileInputStream(fileProduct);
        ObjectInputStream objectIS = new ObjectInputStream(fileIS);
        ArrayList<Product> newList = new ArrayList<>();
        Product product = null;
        try {
            while ((product = (Product) objectIS.readObject()) != null) {
                newList.add(product);
            }
        } catch (EOFException e) {
        }
        return newList;
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void display() {
        System.out.println("=== List Product ===");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public void searchProduct(String id) {
        System.out.println("=== Search Product ===");
        for (Product product : listProduct) {
            if (product.getId().compareTo(id) == 0) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Cannot find this Product");
    }
}