package Week2.Day1;

import Week2.Day2.BT2.Colorable;

public class Square extends Rectangle implements Colorable {
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    
    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public String toString() {
        return "A Square with size = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow" , true);
        System.out.println(square);
    }
}
