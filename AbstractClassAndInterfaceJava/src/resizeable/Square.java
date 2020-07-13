package resizeable;

public class Square implements Resizeable{
    private double side = 3.0;
    private String color = "blue";

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.side*percent/100);
    }
}
