package com.company.lesson4;

public class Factorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("Factorial = " + factorial);
    }

    private static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        }
        return 1;
    }
}
