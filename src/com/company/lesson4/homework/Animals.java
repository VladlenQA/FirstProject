package com.company.lesson4.homework;

public class Animals {
    public static void main(String[] args) {
        int bears = (int) ((Math.random() * (29)) + 2);
        int tigers = (int) ((Math.random() * (29)) + 2);
        int parrots = (int) ((Math.random() * (29)) + 2);
        int elephants = (int) ((Math.random() * (29)) + 2);
        int raccoons = (int) ((Math.random() * (29)) + 2);
        int porcupine = (int) ((Math.random() * (29)) + 2);

        System.out.println("Изначальное кол-во медведей = " + bears);
        System.out.println("Изначальное кол-во тигров = " + tigers);
        System.out.println("Изначальное кол-во папугаев = " + parrots);
        System.out.println("Изначальное кол-во слонов = " + elephants);
        System.out.println("Изначальное кол-во енотов = " + raccoons);
        System.out.println("Изначальное кол-во дикообразов = " + porcupine);

        double coefficientBears = 0.3;
        double coefficientTigers = 0.2;
        double coefficientParrots = 0.4;
        double coefficientElephants = 0.05;
        double coefficientRaccoons = 0.8;
        double coefficientPorcupine = 0.15;

        System.out.println("В этом году в зоопарке " + countAnimals(bears, tigers, parrots, elephants, raccoons) + " животных");
        System.out.println("В следующем году в зоопарке будет " + countAnimalsNextYear(bears, coefficientBears, tigers, coefficientTigers, parrots, coefficientParrots, elephants, coefficientElephants, raccoons, coefficientRaccoons) + " животных");
        System.out.println("Вместе с дикообразом следующем году в зоопарке будет " + countAnimalsNextYear(bears, coefficientBears, tigers, coefficientTigers, parrots, coefficientParrots, elephants, coefficientElephants, raccoons, coefficientRaccoons, porcupine, coefficientPorcupine) + " животных");
    }

    public static int countAnimals(int bears, int tigers, int parrots, int elephants, int racoons) {
        return bears + tigers + parrots + elephants + racoons;
    }

    public static int countAnimalsNextYear(int bears, double coefficientBears,
                                           int tigers, double coefficientTigers,
                                           int parrots, double coefficientParrots,
                                           int elephants, double coefficientElephants,
                                           int racoons, double coefficientRaccoons,
                                           int porcupine, double coefficientPorcupine) {
        int amountAnimals = (int) (bears + bears * coefficientBears) +(int) (tigers + tigers * coefficientTigers) + (int) (parrots + parrots * coefficientParrots) + (int) (elephants + elephants * coefficientElephants) + (int) (racoons + racoons * coefficientRaccoons) + (int) (porcupine + porcupine * coefficientPorcupine);
        return amountAnimals;
    }

    public static int countAnimalsNextYear(int bears, double coefficientBears,
                                           int tigers, double coefficientTigers,
                                           int parrots, double coefficientParrots,
                                           int elephants, double coefficientElephants,
                                           int racoons, double coefficientRaccoons) {
        int amountAnimals = (int) (bears + bears * coefficientBears) +(int) (tigers + tigers * coefficientTigers) + (int)(parrots + parrots * coefficientParrots) + (int)(elephants + elephants * coefficientElephants) + (int) (racoons + racoons * coefficientRaccoons);
        return amountAnimals;
    }
}
