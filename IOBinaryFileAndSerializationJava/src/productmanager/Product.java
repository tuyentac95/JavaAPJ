package productmanager;

public class Product {
    private String id;
    private String name;
    private String manufacturer;
    private int price;
    private String color;

    public Product() {
    }

    public Product(String id, String name, String manufacturer, int price, String color) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] infoToString() {
        String[] info = new String[5];
        info[0] = String.valueOf(this.id);
        info[1] = String.valueOf(this.name);
        info[2] = String.valueOf(this.manufacturer);
        info[3] = String.valueOf(this.price);
        info[4] = String.valueOf(this.color);
        return info;
    }
}
