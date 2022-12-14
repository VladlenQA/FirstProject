package com.company.Lesson6;

public class Shuttles {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; ; i++) {
            String s = Integer.toString(i);
            if (!(s.contains("4") || s.contains("9"))) {
                count++;
                System.out.println("Shuttle № " + s);
                if (count == 100) {
                    break;
                }
            }
        }

    }
}
