package com.company.lesson4;

public class Planes {
    public static void main(String[] args) {
        String type = "Jet";
        String name = "F52";
        int firstClassPassengers = 20;
        int secondClassPassengers = 250;
        buildAirplane(type, name);
        buildAirplane("Boeing", "747", 300);
        buildAirplane("Boeing", "747", 300, 25);

    }
    public static void buildAirplane(String type, String name) {
        String airplane =  type + " " + name;
        System.out.println(airplane);
    }
    public static void buildAirplane(String type, String name, int secondClasPassengers) {
        String airplane = type + " " + name + " " + secondClasPassengers;
        System.out.println(airplane);
    }
    public static void buildAirplane(String type, String name, int firstClasPassengers, int secondClassPassengers) {
        String airplane = type + " " + name + " " + firstClasPassengers + " " + secondClassPassengers;
        System.out.println(airplane);
    }
}
