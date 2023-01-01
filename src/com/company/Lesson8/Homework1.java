package com.company.Lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] first = new Integer[7];
        Integer[] second = new Integer[7];

        for (int i = 0; i < first.length; i++) {
            first[i] = random.nextInt(10);
        }

        System.out.println("Введіть масив чисел з консолі");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < second.length; i++) {
            second[i] = scanner.nextInt();
        }

        matching(first, second);
    }

    public static void matching(Integer[] first, Integer[] second) {
        Arrays.sort(first);
        System.out.println("Перший масив після сортування: " + Arrays.toString(first));
        Arrays.sort(second);
        System.out.println("Другий масив після сортування: " + Arrays.toString(second));

        int count = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                count++;
            }
        }
        System.out.println("Кількість співпадань : " + count);
    }

}
