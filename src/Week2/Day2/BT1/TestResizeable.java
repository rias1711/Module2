package Week2.Day2.BT1;

import Week2.Day1.Circle;

public class TestResizeable extends Circle implements Resizeable {
    @Override
    public double resize(double percent) {
        setRadius(getRadius() * percent/100);
        return getRadius();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(circle);

    }
}
