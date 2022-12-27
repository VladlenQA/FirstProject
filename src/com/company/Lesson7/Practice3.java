package com.company.Lesson7;

import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
            System.out.println(array[i]);
        }

        if (ochki(array) > 0) {
            System.out.println("Основной состав опережает запасной на " + ochki(array) + " oчков");
        } else if (ochki(array) < 0) {
            int b = -ochki(array);
            System.out.println("Запасной состав опережает основной на " + b + " oчков");
        } else {
            System.out.println("Запасной и основной составы набрали одинаковое количество очков");
        }

    }

    public static int ochki(int[] array){
        int sumParnie = 0;
        int sumNeparnie = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumParnie = sumParnie + array [i];
            } else {
                sumNeparnie = sumNeparnie + array[i];
            }
        }
        return sumParnie - sumNeparnie;
    }
}


