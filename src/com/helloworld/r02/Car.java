package com.helloworld.r02;

import java.math.BigDecimal;

public class Car {
    static BigDecimal combustionPerKM;
    BigDecimal petrolInTank = BigDecimal.ZERO;

    public Car(double combustion){
        combustionPerKM = BigDecimal.valueOf(combustion).divide(BigDecimal.valueOf(100));
    }

    public void fillFuelTank(double litresPumped){
        petrolInTank = petrolInTank.add(BigDecimal.valueOf(litresPumped));
    }

    public void ride(int pathInKm){
        int kmDrove = 0;
        System.out.println(combustionPerKM);
        for(int i = 1; i < pathInKm; i++){
            petrolInTank = petrolInTank.subtract(combustionPerKM);
            kmDrove = i+1;
            if(petrolInTank.compareTo(combustionPerKM) <= 0){
                System.out.println("You are out of gas!");
                break;
            }
        }
        System.out.println("You drove " + Integer.toString(kmDrove) + " km");
    }
}
