package com.company.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        System.out.println("Объем параллелипипеда = " + volume (7, 8,9));
        System.out.println("Сумма длин всех сторон параллелипипеда = " + length(7, 8,9));
    }
    public static int volume (int a, int b, int c) {
        return a * b * c;
    }

    public static int length (int a, int b, int c) {
        return a + b + c;
    }
}
