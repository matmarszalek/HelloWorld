package com.helloworld.r01;

import java.math.BigInteger;

public class FactorialCounter {
    public void displayFactorialOf(BigInteger n){

        BigInteger result = BigInteger.ONE;

        while(n != BigInteger.ZERO)
        {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        System.out.printf("Factorial is %d", result);
    }
}
