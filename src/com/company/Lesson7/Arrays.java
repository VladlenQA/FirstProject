package com.company.Lesson7;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        Random random = new Random ();
        int a = 10;
        int randomInt = random.nextInt(a + 1);

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] and value: %d\n", i, array[i]);
        }
        array[0] = randomInt;
        array[2] = 45;

        Object[] objects = {"asd", 45, 4.5};

        String[] seasons = {"winter", "spring", "autumn", "summer"};
        for (String season : seasons) {
            System.out.println("season: " + season);
        }
  
        System.out.println("value " + array[0]);
        System.out.println("value " + array[1]);
        System.out.println("value " + array[2]);
        System.out.println("value of index 1: " + seasons[1]);
    }
}
