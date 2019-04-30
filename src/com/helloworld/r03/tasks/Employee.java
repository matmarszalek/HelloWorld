package com.helloworld.r03.tasks;

public class Employee implements Measurable{
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

}
