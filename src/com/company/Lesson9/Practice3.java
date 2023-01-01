package com.company.Lesson9;

public class Practice3 {
    public static void main(String[] args) {
        char[][] dimArray = new char[8][8];
        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        dimArray[i][j] = 'B';
                    } else {
                        dimArray[i][j] = 'W';
                    }
                } else {
                    if (j % 2 == 0) {
                        dimArray[i][j] = 'W';
                    } else {
                        dimArray[i][j] = 'B';
                    }
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
