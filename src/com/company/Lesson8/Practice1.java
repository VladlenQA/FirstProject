package com.company.Lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(51);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        Integer[] first = Arrays.copyOf(array, 5);
        Integer[] second = Arrays.copyOfRange(array, 5, 10);

        Arrays.sort(first);
        Arrays.sort(second, Collections.reverseOrder());

        System.out.println("Перша частина масиву після сортування: " + Arrays.toString(first));
        System.out.println("Друга частина масиву після сортування: " + Arrays.toString(second));

        Integer[] result = new Integer[array.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, result.length/2, first.length);
        System.out.println(Arrays.toString(result));
    }
}
