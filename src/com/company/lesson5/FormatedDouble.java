package com.company.lesson5;

public class FormatedDouble {
    public static void main(String[] args) {
        System.out.println("Our number is: " + doubleToDecimalPlaces(4.5568, 2));
    }

    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
      //4.556->4.56
        double powTen = Math.pow(10,countAfterPoint);
        return  Math.round(number * powTen) / powTen;
    }
}


