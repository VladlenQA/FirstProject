package com.company.lesson5;

import java.util.Scanner;

public class ConditionalOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");

        int a = scanner.nextInt();

        if (a >= -100 && a <= 100) {
            if (a == 0) {
                System.out.println("Zero value: " + a);
            } else if (a > 0) {
                System.out.println("Positive value: " + a);
            } else {
                System.out.println("Negative value: " + a);
            }
        } else {
            System.out.println("The number should be in range -100 to 100");
        }

        String s;
        switch (a) {
            case 1:
                s = "One";
                break;
            case 2:
                s = "Two";
                break;
            case 3:
                s = "Three";
                 break;
            default:
                s = "Do not know what the value";
        }
        System.out.println(s);
    }
}
