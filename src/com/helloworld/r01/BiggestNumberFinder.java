package com.helloworld.r01;

import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.util.Scanner;

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
    public void run(Scanner in) {
        System.out.println("Run: BiggestNumberFinder. Insert three numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        this.displayBiggestNumMax(num1, num2, num3);
        this.displayBiggestNumIf(num1, num2, num3);
    }
}
