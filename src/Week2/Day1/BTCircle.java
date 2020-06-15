package Week2.Day1;

public class BTCircle {
    private double radius = 1.0;
    private String color = "black";

    public BTCircle(){}

    public BTCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override

    public String toString() {
        return "Đây là hình tròn có bán kính là: " + getRadius() + ", màu: " + getColor() + " và có diện tích: " + getArea();
    }

    public static void main(String[] args) {
        BTCircle btCircle = new BTCircle();
        System.out.println(btCircle);

        btCircle = new BTCircle(5.3, "red");
        System.out.println(btCircle);
    }
}
