package Week1.Day3;

import java.util.Scanner;

public class FindMinBT {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ lớn của mảng: ");
        size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int min = array[0];
        for (int j = 1; j < size; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
