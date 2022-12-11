package com.company.lesson5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Вы ввели целое отрицательное число " + a);
            } else if (a > 0) {
                System.out.println("Вы ввели целое положительное число " + a);
            } else System.out.println("Вы ввели 0");
        }
        else if (scanner.hasNextDouble()) {
            double b = scanner.nextDouble();
            System.out.printf("Вы ввели дробное число = " + "%.2f", b);
        } else {
            String s = scanner.nextLine();
            s = s.toUpperCase();
            s = s.trim();
            System.out.println("Вы ввели строку " + s);
        }
    }
}
