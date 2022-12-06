package com.company.lesson5;

import java.util.Scanner;

public class PracticeThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");
        boolean hasNextInt = scanner.hasNextInt();
        int a = scanner.nextInt();

        String result = hasNextInt ? "Value integer" : "Other type";
        System.out.println("Check is int: " + result);
    }
}
