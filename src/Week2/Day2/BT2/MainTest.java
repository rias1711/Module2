package Week2.Day2.BT2;

import Week2.Day1.Circle;
import Week2.Day1.Rectangle;
import Week2.Day1.Shape;
import Week2.Day1.Square;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3.5);
        shapes[1] = new Circle();
        shapes[2] = new Rectangle(4.2, 3.6);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                System.out.println(colorable.howToColor());
                System.out.println(((Square) shape).getArea());
            }
        }
    }
}
