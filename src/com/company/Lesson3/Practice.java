package com.company.Lesson3;

import java.math.MathContext;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int abs = Math.abs(-3);
        double sqrt = Math.sqrt(64);
        double pow = Math.pow(5, 3);
        double p = Math.pow(125, 1.0/3.0);
        double round = Math.round(p);

        int random = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        String next = scanner.next();
        System.out.println("Enter number b: ");
        int nextInt = scanner.nextInt();

        System.out.println("next string: " + next);
        System.out.println("next int: " + nextInt);

        System.out.println("abs = " + abs);
        System.out.println("sqrt = " + sqrt);
        System.out.println("pow = " + pow);
        System.out.println("Корень кубический p = " + p);
        System.out.println("round = " + round);
        System.out.println("random = " + random );

    }
}
