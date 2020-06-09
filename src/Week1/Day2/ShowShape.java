package Week1.Day2;

import java.util.Scanner;

public class ShowShape {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                int choice2;
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("1. The corner is at top-left");
                System.out.println("2. The corner is at top-right");
                System.out.println("3. The corner is at bottom-left");
                System.out.println("4. The corner is at bottom-right");
                System.out.println("Enter your choice: ");
                choice2 = scanner1.nextInt();

                switch (choice2) {
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 5 - i; j > 0; j--) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("  ");
                            }
                            for (int k = 6 - i; k > 0 ; k--) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 6 - i; j > 0; j--) {
                                System.out.print("  ");
                            }
                            for (int k = 1; k <= i; k++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 5 - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Error!");
        }
    }
}
