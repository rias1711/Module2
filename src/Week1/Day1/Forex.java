package Week1.Day1;

import java.util.Scanner;

public class Forex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;

        System.out.print("Nhập 1 để đổi Dollar - VND, 2 để đổi VND - Dollar: ");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                Scanner dv = new Scanner(System.in);
                double dollar;
                System.out.print("Nhập tiền Dollar: ");
                dollar = dv.nextDouble();
                double rate = dollar * 23000;
                System.out.print("VND: " + rate);
                break;
            case 2:
                Scanner vd = new Scanner(System.in);
                double vnd;
                System.out.print("Nhập tiền VND: ");
                vnd = vd.nextDouble();
                double rate2 = vnd / 23000;
                System.out.print("Dollar: " + rate2);
                break;
            default:
                System.out.print("Lỗi!");
        }


    }
}
