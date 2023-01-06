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
        System.out.println("---------------------------------");
        int[][][] theeDemArray = {
                {{36, 2, 3}, {26, 54, 5}, {3, 11, 62}},
                {{17, 77, 28}, {3, 5, 5}, {13, 1, 62}}
        };
        for (int i = 0; i < theeDemArray.length; i++) {
            for (int j = 0; j < theeDemArray[i].length; j++) {
                for (int k = 0; k < theeDemArray[i][j].length; k++) {
                    System.out.print(theeDemArray[i][j][k] + " ");
                }
                System.out.println();
//                System.out.println(Arrays.toString(theeDemArray[i][j]));
            }
            System.out.println();
        }

        int[][] matrix = {
                {1,2,3,4,5},
                {4,2,7,4,8}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        int[][] transponseMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int value = matrix[j][i];
                transponseMatrix[j][i] = value;
                System.out.print(value + " ");
            }
            System.out.println();
        }


    }

}
