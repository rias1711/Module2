package Week2.Day1;

public class BTCylinder extends BTCircle {
    private double height = 1.0;

    public BTCylinder() {}

    public BTCylinder(double height) {
        this.height = height;
    }

    public BTCylinder(double height, double radius, String color) {
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
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Đây là hình trụ có chiều cao: " + getHeight() + " với thể tích là: " + getVolume() + " kế thừa từ lớp hình tròn: " + super.toString();
    }

    public static void main(String[] args) {
        BTCylinder btCylinder = new BTCylinder();
        System.out.println(btCylinder);

        btCylinder = new BTCylinder(4.2);
        System.out.println(btCylinder);

        btCylinder = new BTCylinder(4.2, 2.4, "pink");
        System.out.println(btCylinder);
    }
}
