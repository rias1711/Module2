package Week2.Day1;

import java.util.Arrays;

public class Point {
     private float x = 0.0f;
     private float y = 0.0f;

     public Point() {}

     public Point(float x, float y) {
         this.x = x;
         this.y = y;
     }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
         this.x = x;
         this.y = y;
    }

    public float[] getXY() {
         float[] array = new float[2];
         array[0] = getX();
         array[1] = getY();
         return array;
    }

    @Override
    public String toString() {
         return "Điểm trong không gian 2 chiều tại tọa độ (x,y): " + Arrays.toString(getXY());
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(3.0f, 4.0f);
        System.out.println(point);
    }
}
