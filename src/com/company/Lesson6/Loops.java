package com.company.Lesson6;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int limit = 10;
        for (int i = 0; i <= limit; i++) {
            System.out.println("cycle: " + i);
        }

        for (int i = limit; i > 0; i--) {
            System.out.println("decrement cycle: " + i);
        }

        int i = 0;
        while (i <= limit) {
            i++;
            System.out.println("while cycle: " + i);
        }

        do {
            System.out.println("loop do while: " + i--);
        } while (i > 0);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter some valuer: ");
            String s = scanner.nextLine();
            if (s.equals("q")) {
                break;
            }
        } while (true);
    }
}
