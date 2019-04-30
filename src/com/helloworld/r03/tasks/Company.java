package com.helloworld.r03.tasks;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Company {

    private ArrayList<Measurable> employees;

    public Company()
    {
        this.initEmployees();
    }

    private void initEmployees() {
        employees = new ArrayList();
    }

    public Company(Employee[] emps){
        this();
        for(int i=0; i<emps.length; i++)
            this.addEmployee(emps[i]);
    }

    private void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public Measurable largest(Measurable[] objects){
        Arrays.sort(objects,
                Comparator.comparingDouble(Measurable::getMeasure));
        return objects[0];
    }
}
