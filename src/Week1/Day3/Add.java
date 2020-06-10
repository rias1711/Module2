package Week1.Day3;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int arraySize;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập độ dài mảng mong muốn (>= 5): ");
            arraySize = scanner.nextInt();
        } while (arraySize < 5);

        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize - 3; i++) {
            arr[i] = (int) (Math.floor(Math.random() * 10) + 1);
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Nhập số cần chèn vào mảng: ");
        int X = scanner.nextInt();
        System.out.println("Nhập vị trí càn chèn vào mảng: ");
        int index = scanner.nextInt();

        Add(arr, X, index);
    }
    public static void Add(int[] array, int X, int index) {
        if (index <= 1 && index >= array.length) {
            System.out.println("Không thể chèn!");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        return;
    }
}
