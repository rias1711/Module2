package Week1.Day3;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        int sum = 0;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ lớn của mảng: ");
        size = scanner.nextInt();
        int col;
        System.out.println("Nhập vào cột muốn tính tổng: ");
        col = scanner.nextInt();

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] =(int) Math.floor(Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < size; i++) {
            sum += array[i][col - 1];
        }
        System.out.println("Tổng các số ở cột " + col + " là: " + sum);
    }
}
