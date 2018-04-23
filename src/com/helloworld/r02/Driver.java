package com.helloworld.r02;

import com.helloworld.r02.Car;
import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.util.Scanner;

public class Driver extends TaskRunner{
    public Driver(ChapterRunner owner) {
        super(owner);
    }

    Car car;

    void getACar(int combustion){
        car = new Car(combustion);
    }

    @Override
    public void run(Scanner in) {
        System.out.println("How many litres per 100 km should the car combust?");
        getACar(in.nextInt());

        if(car == null){
            System.out.println("You don't have a car!");
            return;
        }

        System.out.println("Fill the gas tank");
        car.fillFuelTank(in.nextInt());
        System.out.println("How many km do you want to drive?");
        car.ride(in.nextInt());
    }
}
