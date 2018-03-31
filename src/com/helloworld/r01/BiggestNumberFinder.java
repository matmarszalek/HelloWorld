package com.helloworld.r01;

import com.helloworld.ChapterRunner;
import com.helloworld.TaskRunner;

public class BiggestNumberFinder extends TaskRunner {

    public BiggestNumberFinder(ChapterRunner owner) {
        super(owner);
    }

    public void displayBiggestNumIf(int num1, int num2, int num3){
        int biggestNum = num1 > num2 ? num1 : num2;
        biggestNum = biggestNum > num3 ? biggestNum : num3;
        System.out.println(biggestNum);
    }

    public void displayBiggestNumMax(int num1, int num2, int num3){
        int biggestNum = Math.max(Math.max(num1, num2), num3);
        System.out.println(biggestNum);
    }

    @Override
    public void run() {

    }
}
