package com.helloworld.r01;

import com.helloworld.ChapterRunner;
import com.helloworld.TaskRunner;

import java.util.Scanner;

public class AngleNormalizer extends TaskRunner {
    public AngleNormalizer(ChapterRunner owner) {
        super(owner);
    }

    public void displayPercentNormalizedAngle(int angle){
        int normalizedAngle = (angle % 360);
        System.out.println(normalizedAngle);
    }
    public void displayModNormalizedAngle(int angle){
        int normalizedAngle = Math.floorMod(angle, 360);
        System.out.println(normalizedAngle);
    }

    @Override
    public void run(Scanner in) {
        System.out.println("Run: AngleNormalizer. Insert a number which will be the angle:");
        int num = in.nextInt();
        this.displayPercentNormalizedAngle(num);
        this.displayModNormalizedAngle(num);
    }
}
