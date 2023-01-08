package com.company.Lesson10;

public class ColorBox extends Box {

    String color;

    public ColorBox(int a, int b, int h, String color) {
        super(a, b, h);
        this.color = color;
    }

    public ColorBox(int a, int b, int h, String name, String color) {
        super(a, b, h, name);
        this.color = color;
    }

    public void printColor() {
        System.out.println("color = " + this.color);
    }
}
