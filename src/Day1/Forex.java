package Day1;

import java.util.Scanner;

public class Forex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar;

        System.out.print("Nhập vào Dollar: ");
        dollar = scanner.nextInt();

        double rate = dollar * 23000;
        System.out.print("VND: " + rate);
    }
}
