package com.company.lesson5;

import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value: ");

        int a = scanner.nextInt();
        System.out.println(numberToSeason(a));
    }

    public static String numberToSeason(int a) {
        String s;
        switch (a) {
            case 1:
                s = "Winter";
                break;
            case 2:
                s = "Winter";
                break;
            case 3:
                s = "Spring";
                break;
            case 4:
                s = "Spring";
                break;
            case 5:
                s = "Spring";
                break;
            case 6:
                s = "Summer";
                break;
            case 7:
                s = "Summer";
                break;
            case 8:
                s = "Summer";
                break;
            case 9:
                s = "Autumn";
                break;
            case 10:
                s = "Autumn";
                break;
            case 11:
                s = "Autumn";
                break;
            case 12:
                s = "Winter";
                break;
            default:
                s = "Number should be in range from 1 to 12";
        }
        return s;
    }
}
