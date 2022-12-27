package com.company.Lesson7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть довжину масиву");
            a = scanner.nextInt();
            if (a > 0) {
                break;
            }
        }
        while (true);

        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = -20 + random.nextInt(41);
        }
        System.out.println("Масив елементів: " + Arrays.toString(array));
        System.out.println("Максимальний елемент масива: " + max(array));
        System.out.println("Мінімальний елемент масива: " + min(array));
        System.out.println("Середнє значениия масива: " + averageValue(array));
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double averageValue (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / (double) array.length;
        return average;
    }
}
