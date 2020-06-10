package Week1.Day3;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5, 6, 7, 8, 9};

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check and delete: ");
        num = scanner.nextInt();

        int[] result = delArr(arr, num);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] delArr(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        return array;
    }
}
