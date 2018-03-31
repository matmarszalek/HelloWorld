package com.helloworld.r01;

import com.helloworld.ChapterRunner;
import com.helloworld.TaskRunner;

import java.util.Scanner;

public class NumberConverter extends TaskRunner
{
    public NumberConverter(ChapterRunner owner) {
        super(owner);
    }

    private void displayAsBinary(int num){
        System.out.printf("As binary the number %d is %b\n", num, num);
    }

    private void displayAsOct(int num){
        System.out.printf("As oct the number %d is %o\n", num, num);
    }

    private void displayAsHex(int num){
        System.out.printf("As hex the number %d is %x\n", num, num);
    }

    private void displayAsHex2(int num){
        double num2 = (1.0/(float) num);
        System.out.printf("As hex odwrotny the number %d is %a", num, num2);
    }

    @Override
    public void run(Scanner in) {
        System.out.println("Run: Number converter. Insert a number:");
        int num = in.nextInt() ;
        this.displayAsBinary(num);
        this.displayAsHex(num);
        this.displayAsHex2(num);
        this.displayAsOct(num);
    }
}
