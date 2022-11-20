package com.company.lesson4;

public class Truck {
    public static void main(String[] args) {
        int length = 2;
        int weight = 3;
        int height = 4;
        int volume = countVolume(length, weight, height);
        System.out.println("Объем = " + volume);
    }
    public static int countVolume(int length, int weight, int height) {
        return length * weight * height;
    }
}
