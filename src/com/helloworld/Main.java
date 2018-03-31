package com.helloworld;

import com.helloworld.r01.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ChapterOneRunner chap1Runner = new ChapterOneRunner();
        chap1Runner.runChapter(in);
        /* System.out.println("Hello World");
        PascalTriangle a = new PascalTriangle();
        a.createPascalTriangle(6);
        System.out.println(Arrays.deepToString(a.triangle));


        int angle = in.nextInt();
        norm.displayModNormalizedAngle(angle);
        norm.displayPercentNormalizedAngle(angle);*/
    }
}

class PascalTriangle {
    public int[][] triangle;

    void createPascalTriangle(int n){
        triangle = new int[n][];
        for(int i=0; i< n; i++){
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for(int j= 1; j < i; j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
    }
}

