package com.company.Lesson9;

import java.util.Arrays;

public class DimensionArrays {
    public static void main(String[] args) {
        int[][] dimArray = {
                {1, 2, 5, 6, 0},
                {9, 2, 8},
                {1, 2}
        };

        for (int i = 0; i < dimArray.length; i++) {
            System.out.println("len: " + dimArray[i].length + " index: " + i + " " + Arrays.toString(dimArray[i]));
        }

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.print(dimArray[i][j] + " ");
            }
            System.out.println();
        }

    }

}
