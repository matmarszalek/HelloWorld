package com.helloworld.r03.employees;

public class Employee implements Person, Identified, Measurable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() { return Identified.super.getId(); }

    public double getMeasure() {
        return salary;
    }
}