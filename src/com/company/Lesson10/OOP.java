package com.company.Lesson10;

public class OOP {
    public static void main(String[] args) {
        Box box = new Box(10,20, 2);
        box.a = 10;
        box.b = 20;
        box.h = 2;
        box.volume();
        box.printHeight();

        Employee employee = new Employee("Vladlen", "Kryvoi");
        employee.printEmployee();

        Employee employee2 = new Employee("Max", "Tishenko", 500);
        employee2.printEmployeeSalary();

        ColorBox colorBox = new ColorBox(20,30,40,"green");
        colorBox.printColor();

    }
}
