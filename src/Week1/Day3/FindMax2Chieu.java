package Week1.Day3;

import java.util.Scanner;

public class FindMax2Chieu {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài ma trận: ");
        size = scanner.nextInt();

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * 100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        int col = 0;
        int row = 0;
        int max = matrix[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    col = j + 1;
                    row = i + 1;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng hai chiều là: " + max + ", tại hàng " + row + ", cột " + col);
    }
}
