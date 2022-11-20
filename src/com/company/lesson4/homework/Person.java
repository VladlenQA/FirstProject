package com.company.lesson4.homework;

public class Person {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "2936729462568"));
    }

    public static String personInfo(String firstName, String lastName, String city, String phone){
        return "Зателефонувати громадянину " + firstName + " " + lastName + " із міста " + city + " можливо за номером " + phone;
    }
}
