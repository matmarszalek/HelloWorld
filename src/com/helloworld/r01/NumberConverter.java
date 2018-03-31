package com.helloworld.r01;

import com.helloworld.ChapterRunner;
import com.helloworld.TaskRunner;

public class NumberConverter extends TaskRunner
{
    public NumberConverter(ChapterRunner owner) {
        super(owner);
    }

    public void displayAsBinary(int num){
        System.out.printf("As binary the number %d is %b\n", num, num);
    }

    public void displayAsOct(int num){
        System.out.printf("As oct the number %d is %o\n", num, num);
    }

    public void displayAsHex(int num){
        System.out.printf("As hex the number %d is %x\n", num, num);
    }

    public void displayAsHex2(int num){
        double num2 = (1.0/(float) num);
        System.out.printf("As hex odwrotny the number %d is %a", num, num2);
    }

    @Override
    public void run() {

    }
}
