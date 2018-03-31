package com.helloworld.r01;

import com.helloworld.ChapterRunner;
import com.helloworld.TaskRunner;

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
    public void run() {

    }
}
