package com.helloworld;

import com.helloworld.r01.*;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NumberConverter conv = new NumberConverter();
        AngleNormalizer norm = new AngleNormalizer();
        BiggestNumberFinder finder = new BiggestNumberFinder();
        FactorialCounter facounter = new FactorialCounter();

        /* System.out.println("Hello World");
        PascalTriangle a = new PascalTriangle();
        a.createPascalTriangle(6);
        System.out.println(Arrays.deepToString(a.triangle));

        int num = in.nextInt();
        conv.displayAsBinary(num);
        conv.displayAsOct(num);
        conv.displayAsHex(num);
        conv.displayAsHex2(num);

        int angle = in.nextInt();
        norm.displayModNormalizedAngle(angle);
        norm.displayPercentNormalizedAngle(angle);*/

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        finder.displayBiggestNumIf(num1, num2, num3);
        finder.displayBiggestNumMax(num1, num2, num3);

        BigInteger facNum= in.nextBigInteger();
        facounter.displayFactorialOf(facNum);
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

