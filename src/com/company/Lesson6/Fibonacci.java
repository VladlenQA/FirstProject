package com.company.Lesson6;

public class Fibonacci {
    public static void main(String[] args) {
       int f1 = 0;
       int f2 = 1;
       int f3 = 1;
        System.out.println("Число № 1 = " + f1);
        System.out.println("Число № 2 = " + f2);
        System.out.println("Число № 3 = " + f3);
        for (int i = 4; i <= 11; i++) {
            int f4 = f3 +f2;
            System.out.println("Число № " + i + " = " + f4);
            f2 = f3;
            f3 = f4;
       }
    }
}
