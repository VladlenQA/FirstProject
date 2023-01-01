package com.company.Lesson9;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Введіть число n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dimArray = new int [n][n];
        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                if (i == j) {
                    dimArray[i][j] = 1;
                } else {
                    dimArray[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.print(dimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
