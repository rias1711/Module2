package Week1.Day3;

import java.util.Scanner;

public class SumDia {
    public static void main(String[] args) {
        int size;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ lớn của mảng: ");
        size = scanner.nextInt();

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                array[i][j] = (int) Math.floor(Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < size; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính ma trận vuông là: " + sum);
    }
}
