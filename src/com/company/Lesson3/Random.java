package com.company.Lesson3;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        int c = (int) ((Math.random() * (b - a + 1)) + a);
        System.out.println("The random value is " + c +" between range: " +  a + " and " + b);
    }
}
