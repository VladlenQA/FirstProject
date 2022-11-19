package com.company.lesson4;

public class Methods {
    public static void main(String[] args) {
        hello("Will");
        hello(45);
        String hello = concat("Hello", "Vladlen");
        System.out.println(hello);
    }

    public static void hello(String age) {
        System.out.println("Hello " + age);
    }

    public static void hello(int age) {
        System.out.println("Hello " + age);
    }

    /**
     *  Concat 2 Strings
     * @param str
     * @param str2
     * @return
     */
    public static String concat(String str, String str2) {
        String result = str +": " + str2;
        return result;
    }
}
