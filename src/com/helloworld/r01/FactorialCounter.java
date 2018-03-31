package com.helloworld.r01;

import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCounter extends TaskRunner {
    public FactorialCounter(ChapterRunner owner) {
        super(owner);
    }

    private void displayFactorialOf(BigInteger n){

        BigInteger result = BigInteger.ONE;

        while(n != BigInteger.ZERO){
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        System.out.printf("Factorial is %d", result);
    }

    @Override
    public void run(Scanner in) {
        System.out.println("Run: FactorialCounter. Insert a number, for which the factorial will be calculated:");
        BigInteger num = in.nextBigInteger();
        this.displayFactorialOf(num);
    }
}
