package Week1.Day5;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 2;
        circle1.color = "black";
        System.out.println("Hình tròn thứ nhất có bán kính là: " + circle1.getRadius() + ", diện tích là: " + circle1.getArea());

        Circle circle2 = new Circle(3);
        System.out.println("Hình tròn thứ hai có bán kính là: " + circle2.getRadius() + ", diện tích là: " + circle2.getArea());
    }
}
