package Week2.Day4.BT1;

import java.util.Scanner;

public class NextDayCalculator {
    public static String dayToSearch(int day, int month, int year) {
        int nextDay = 0;
        int nextMonth = month;
        int nextYear = year;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Input day:");
//        day = scanner.nextInt();
        nextDay = day + 1;

//        System.out.println("Input month:");
//        month = scanner.nextInt();
//
//        System.out.println("Input year:");
//        year = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    nextDay = 1;
                    nextMonth++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    nextDay = 1;
                    nextMonth++;
                } break;
            case 12:
                if (day == 31) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear++;
                } break;
            case 2:
                boolean isLeapYear = false;

                boolean isDivisibleBy4 = year % 4 == 0;
                if (isDivisibleBy4) {
                    boolean isDivisibleBy100 = year % 100 == 0;
                    if (isDivisibleBy100) {
                        boolean isDivisible400 = year % 400 == 0;
                        if (isDivisible400) {
                            isLeapYear = true;
                        }
                    } else {
                        isLeapYear = true;
                    }
                }
                if (isLeapYear) {
                    if (day == 29) {
                        nextDay = 1;
                        nextMonth++;
                    } else if (day > 29) {
                        System.out.println("Error!");
                    }
                } else {
                    if (day == 28) {
                        nextDay = 1;
                        nextMonth++;
                    } else if (day > 28) {
                        System.out.println("Error!");
                    }
                } break;
            default:
                System.out.println("Error!");
        }
        String text = "Day: " + day + "/" + month + "/" + year + "\n Next day: " + nextDay + "/" + nextMonth + "/" + nextYear;
        return text;
    }
}
