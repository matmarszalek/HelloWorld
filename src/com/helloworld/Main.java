package com.helloworld;

import com.helloworld.r01.*;
import com.helloworld.r02.ChapterTwoRunner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ChapterOneRunner chap1Runner = new ChapterOneRunner();
        //chap1Runner.runChapter(in);
        ChapterTwoRunner chap2Runner = new ChapterTwoRunner();
        chap2Runner.runChapter(in);
        /* System.out.println("Hello World");
        PascalTriangle a = new PascalTriangle();
        a.createPascalTriangle(6);
        System.out.println(Arrays.deepToString(a.triangle));


        int angle = in.nextInt();
        norm.displayModNormalizedAngle(angle);
        norm.displayPercentNormalizedAngle(angle);*/
    }
}

