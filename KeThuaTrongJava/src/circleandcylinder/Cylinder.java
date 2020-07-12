package circleandcylinder;

public class Cylinder extends Circle1 {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{"
                + "radius=" + super.getRadius()
                + "height=" + this.getHeight()
                + "volume=" + this.getVolume()
                + '}';
    }
}
