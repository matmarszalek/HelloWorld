package com.helloworld.r01;

public class AngleNormalizer {
    public void displayPercentNormalizedAngle(int angle){
        int normalizedAngle = (angle % 360);
        System.out.println(normalizedAngle);
    }
    public void displayModNormalizedAngle(int angle){
        int normalizedAngle = Math.floorMod(angle, 360);
        System.out.println(normalizedAngle);
    }
}
