package Week1.Day2;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        a = Math.abs(a);
        System.out.println("Enter b: ");
        b = nhap.nextInt();
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.println("Greatest common factor: " + a);
        }

    }
}
