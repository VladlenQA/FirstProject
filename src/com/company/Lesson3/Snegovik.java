package com.company.Lesson3;

public class Snegovik {
    public static void main(String[] args) {
        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double p = 0.7;
        double v1 = 4/3 * Math.PI * Math.pow(r1, 3);
        double v2 = 4/3 * Math.PI * Math.pow(r2, 3);
        double v3 = 4/3 * Math.PI * Math.pow(r3, 3);
        double m = v1 * p + v2 * p + v3 * p;
        System.out.println("Масса снеговика = " + m + "Кг");
        System.out.printf("Mасса снеговика округленная = " + "%.3f", m);
        System.out.print("Кг");

    }
}
