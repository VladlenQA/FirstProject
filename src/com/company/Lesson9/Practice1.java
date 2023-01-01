package com.company.Lesson9;

public class Practice1 {
    public static void main(String[] args) {
        int[][] dimArray = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };

        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.print(dimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
