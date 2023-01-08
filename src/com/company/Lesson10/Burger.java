package com.company.Lesson10;

public class Burger {
    public String bul;
    public String meat1;
    public String meat2;
    public String cheese;
    public String greens;
    public String mayonnaise;

    public Burger(String bul, String meat1, String cheese, String greens, String mayonnaise) {
        this.bul = bul;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад звичайного бургера: " + bul + ", " + meat1 + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burger (String bul, String meat, String cheese, String greens) {
        this.bul = bul;
        this.meat1 = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Склад веганського бургера: " + bul + ", " + meat1 + ", " + cheese + ", " + greens);
    }

    public Burger(String bul, String meat1, String meat2, String cheese, String greens, String mayonnaise) {
        this.bul = bul;
        this.meat1 = meat1;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад бургера із подвійним м’ясом: " + bul + ", " + meat1 + ", " + meat2 + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }
}
