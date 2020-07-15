package triangle;

public class Shape1 {
    private String color = "red";

    public Shape1() {
    }

    public Shape1(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape1{" +
                "color='" + color + '\'' +
                '}';
    }
}
