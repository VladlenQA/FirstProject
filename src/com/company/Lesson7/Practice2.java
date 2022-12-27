package com.company.Lesson7;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Practice2 {
    public static void main (String[] args) {
        Random random = new Random();
       int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            System.out.println(array[i]);
        }
        int max = array[0];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                a = i;
            }
        }
        System.out.println("Mаксимальный элемент массива = " + max);
        System.out.println("Индес максимального элемент массива = " + a);
        System.out.println("Подозреваемый имеет индекс " + podozrevaemiy(array));
    }

    public static int podozrevaemiy(int[] array) {
        int max = array[0];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                a = i;
            }
        }
        return a;
    }


}
