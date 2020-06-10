package Week1.Day3;

import java.util.Scanner;

public class ChangeDegree {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter a number you choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter your Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
