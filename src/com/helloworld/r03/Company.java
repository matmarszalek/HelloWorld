package com.helloworld.r03;

import com.helloworld.r03.employees.Employee;
import com.helloworld.r03.employees.Measurable;
import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.math.BigDecimal;
import java.util.Scanner;

public class Company extends TaskRunner{
    Employee[] employees;

    public Company(ChapterRunner owner) {
        super(owner);
    }


    public BigDecimal average(Measurable[] mes){
        int length = mes.length;
        BigDecimal sum = BigDecimal.ZERO;
        for(Measurable m : mes){
            sum = sum.add(BigDecimal.valueOf(m.getMeasure()));
        }
        return sum.divide(BigDecimal.valueOf(length));
    }

    @Override
    public void run(Scanner in) {
        employees = new Employee[]{
                new Employee("Kuba", 12000),
                new Employee("Artur", 8000),
                new Employee("Lukasz", 4000)
        };
        System.out.println(average(employees));
    }
}
