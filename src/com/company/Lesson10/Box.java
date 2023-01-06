package com.company.Lesson10;

public class Box {
    //у класса есть свойства
    int a;
    int b;
    int h;
    String name;

    //поведение у класса - это его методы
    public void volume(){
        System.out.println("volume = " + a * b * h);
    }

    public void printHeight() {
        System.out.println("height = " + h);
    }
}
