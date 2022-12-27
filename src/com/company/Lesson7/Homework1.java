package com.company.Lesson7;

import java.util.Arrays;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        Random random = new Random();

        for (int i = 0; i < team1.length; i++ ) {
            team1[i] = 18 + random.nextInt(23);
        }

        for (int i = 0; i < team2.length; i++ ) {
            team2[i] = 18 + random.nextInt(23);
        }

        System.out.println("Вік гравців першої команди " + Arrays.toString(team1));
        System.out.println("Вік гравців другої команди " + Arrays.toString(team2));
        System.out.println("Середній вік гравців першої команди " + averageAge(team1));
        System.out.println("Середній вік гравців другої команди " + averageAge(team2));
    }

    public static double averageAge (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / (double) array.length;
        return average;
    }

}
