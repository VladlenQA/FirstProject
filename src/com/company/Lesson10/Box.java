package com.company.Lesson10;

public class Box {
    //у класса есть свойства
    int a;
    int b;
    int h;
    String name;

    public Box(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Box(int a, int b, int h, String name) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.name = name;
    }

    //поведение у класса - это его методы
    public void volume(){
        System.out.println("volume = " + a * b * h);
    }

    public void printHeight() {
        System.out.println("height = " + h);
    }
}
