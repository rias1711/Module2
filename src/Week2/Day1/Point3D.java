package Week2.Day1;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {}

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z, float x, float y) {
        z = getZ();
        x = getX();
        y = getY();
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }

    @Override
    public String toString() {
        return "Không gian 3 chiều (x, y, z) là: " + Arrays.toString(getXYZ()) + ", kế thừa của " + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3.4f);
        System.out.println(point3D);

        point3D = new Point3D(3.4f, 2.5f, 4.1f);
        System.out.println(point3D);
    }
}
