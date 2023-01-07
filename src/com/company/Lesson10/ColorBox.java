package com.company.Lesson10;

public class ColorBox extends Box {

    String color;

    public void printColor(String color) {
        this.color = color;
        System.out.println("color = " + this.color);
    }
}
