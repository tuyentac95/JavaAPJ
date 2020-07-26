package productmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManagerByArrayList {
    private ArrayList<Product> products;

    public ProductManagerByArrayList() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void change(String id, String name, int price) {
        for (Product product : products) {
            if (product.getId().compareTo(id) == 0) {
                product.setName(name);
                product.setPrice(price);
            }
        }
    }

    public void remove(String id) {
        for (int i=0; i < products.size(); i++) {
            if (products.get(i).getId().compareTo(id) == 0) {
                products.remove(i);
            }
        }
    }

    public void display() {
        System.out.println("Product list: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void find(String name) {
        boolean check = false;
        for (int i=0; i < products.size(); i++) {
            if (products.get(i).getName().compareTo(name) == 0) {
                System.out.println(products.get(i));
                check = true;
            }
        }
        if (!check) System.out.println("Don't have the product " + name);
    }

    public void sortLowToHigh() {
        products.sort((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else return 1;
        });
    }

    public void sortHighToLow() {
        products.sort((o1, o2) -> {
            if (o1.getPrice() < o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() == o2.getPrice()) {
                return 0;
            } else return -1;
        });
    }

}
