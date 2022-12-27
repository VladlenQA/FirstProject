package com.company.Lesson7;

import java.util.Random;

public class Practice1 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(11);
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }

        }

    }
}
