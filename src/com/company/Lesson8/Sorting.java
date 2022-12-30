package com.company.Lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        System.out.println("Before sorting: " + Arrays.toString(array));
        long begin = System.currentTimeMillis();
        Arrays.sort(array);
        //bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
        System.out.println("After array sorting: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("After reverse sorting: " + Arrays.toString(array));

        printElements(2,3,4);

        Integer[] firstPart = Arrays.copyOf(array, 4);
        System.out.println("Copy from beginning: " + Arrays.toString(firstPart));
    }

    private static void printElements(int ... array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    private static void bubbleSort(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    buffer = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = buffer;
                }

            }
        }
    }
}






