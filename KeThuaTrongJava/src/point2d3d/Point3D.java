package point2d3d;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] coordinate = new float[3];
        coordinate[0] = super.getX();
        coordinate[1] = super.getY();
        coordinate[2] = this.z;
        return coordinate;
    }

    @Override
    public String toString() {
        return "(" + super.getX()
                + "," + super.getY()
                + "," + this.z + ")";
    }
}
