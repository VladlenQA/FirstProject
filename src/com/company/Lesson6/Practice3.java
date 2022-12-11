package com.company.Lesson6;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a > 0) {
                    System.out.println("Это положительное целое число, спасибо " + a);
                    break;
                } else if (a < 0) {
                    System.out.println("Нужно ввести целое положительное число");
                }
            } else {
                System.out.println("Это не целое положительное число, попробуйте еще");
            }
        } while (true);
    }
}
