package Week1.Day2;

import java.util.Scanner;

public class Show20SNT {
    public static void main(String[] args) {
        int numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        while (count < numbers) {
            boolean checked = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    checked = false;
                }
            }
            if (checked) {
                System.out.println(N);
                count++;
            }
            N++;

        }
    }
}
