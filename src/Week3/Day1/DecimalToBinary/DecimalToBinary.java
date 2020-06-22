package Week3.Day1.DecimalToBinary;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

public class DecimalToBinary {
    private LinkedList<Integer> stack;

    public DecimalToBinary() {
        stack = new LinkedList();
    }

    public static void transfer() {
        DecimalToBinary stack = new DecimalToBinary();
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi: ");
        number = scanner.nextInt();

        while (number != 0) {
            stack.push(number % 2);
            number = number/2;

        }
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
    }

    private void push(int i) {
        stack.addFirst(i);
    }

    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        transfer();
    }
}
