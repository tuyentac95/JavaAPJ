package productmanager;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P001","Product 1",50000);
        Product product2 = new Product("P002","Product 2",30000);
        Product product3 = new Product("P003","Product 3",25000);

        ProductManagerByArrayList products = new ProductManagerByArrayList();

        products.add(product1);
        products.add(product2);

        products.display();

        products.add(product3);
        products.change("P001","Product 1",100000);

        System.out.println("After change");
        products.display();

        System.out.println("Find Product");
        products.find("Product 3");

        System.out.println("Sort by price from Low to High");
        products.sortLowToHigh();
        products.display();

        System.out.println("Sort by price from High to Low");
        products.sortHighToLow();
        products.display();

        System.out.println("Remove Product P002");
        products.remove("P002");
        products.display();
    }
}
