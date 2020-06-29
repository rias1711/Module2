package Week3.Day1.ReverseInStack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseInStack<T> {
    private static LinkedList<Integer> stack;

    public ReverseInStack() {
        stack = new LinkedList<Integer>();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(T element) {
        stack.addFirst((Integer) element);
    }

    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập các phần tử thứ " + (i + 1) + " của mảng: ");
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
}
