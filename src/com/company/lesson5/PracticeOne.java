package com.company.lesson5;

import java.util.Scanner;

public class PracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");

        int a = scanner.nextInt();
        System.out.println(numberToDay(a));
    }

    public static String numberToDay(int a) {
        String s;
        if (a >= 1 && a <= 7) {
            if (a == 1) {
                s = "Monday";
            } else if (a == 2) {
                s = "Tuesday";
            } else if (a == 3) {
                s = "Wednesday";
            } else if (a == 4) {
                s = "Thursday";
            } else if (a == 5) {
                s = "Friday";
            } else if (a == 6) {
                s = "Saturday";
            } else s = "Sunday";
        } else
            s = "The number should be in range from 1 to 7";
        return s;
    }

}
