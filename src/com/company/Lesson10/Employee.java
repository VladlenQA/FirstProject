package com.company.Lesson10;

public class Employee {
    String name;
    String surname;
    int salary;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printEmployeeSalary() {
        System.out.println(salary);
    }

    public Employee(String someName, String someSurname, int someSalary) {
        name = someName;
        surname = someSurname;
        salary = someSalary;
    }

    public void printEmployee() {
        System.out.println("employee name = " + name + " " + surname);
    }
}
