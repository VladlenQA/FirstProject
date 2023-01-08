package com.company.Lesson10;

public class BurgerHouse {
    public static void main(String[] args) {
        Burger simpleBurger = new Burger("булочка", "м’ясо", "сир",
                "зелень", "майонез");
        Burger veganBurger = new Burger("булочка", "м’ясо", "сир", "зелень");
        Burger doubleMeatBurger = new Burger("булочка", "м’ясо", "м’ясо", "сир",
                "зелень", "майонез");
    }
}
