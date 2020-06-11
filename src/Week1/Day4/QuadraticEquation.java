package Week1.Day4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(double a, double b, double c) {
        delta = b * b - 4 * a * c;
        return delta;
    }
    public double getRoot1() {
        return ((-b + Math.pow(delta, 0.5))/(2 * a));
    }
    public double getRoot2() {
        return ((-b - Math.pow(delta, 0.5))/(2 * a));
    }

    public static void main(String[] args) {
        QuadraticEquation math = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        math.a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        math.b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        math.c = scanner.nextDouble();
        double delta = math.getDiscriminant(math.a, math.b, math.c);

        if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm: " + math.getRoot1() + " và " + math.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: " + math.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
