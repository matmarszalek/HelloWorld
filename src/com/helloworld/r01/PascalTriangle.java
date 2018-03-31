package com.helloworld.r01;

import com.helloworld.ChapterRunner;
import com.helloworld.TaskRunner;

import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle extends TaskRunner{

    public PascalTriangle(ChapterRunner owner) {
        super(owner);
    }

    private void createPascalTriangle(int n){
        int[][] triangle = new int[n][];
        for(int i=0; i< n; i++){
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for(int j= 1; j < i; j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        System.out.println(Arrays.deepToString(triangle));
    }

    @Override
    public void run(Scanner in) {
        System.out.println("Run: PascalTriangle. Insert a number, which will be the depth of teh triangle:");
        this.createPascalTriangle(in.nextInt());
    }
}
