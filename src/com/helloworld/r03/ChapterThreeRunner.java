package com.helloworld.r03;

import com.helloworld.runners.ChapterRunner;

public class ChapterThreeRunner extends ChapterRunner {
    public ChapterThreeRunner(){
        new Company(this);
        IntSequence seq = IntSequence.of(1,2,3,4);
        while(seq.hasNext())
            System.out.println(seq.next());
        seq = IntSequence.constant(1);
        for(int i = 0; i < 10; i++)
            System.out.println(seq.next());
        new GreeterRunner();
        Runnable[] tasks = {
                new Greeter("Witaj", 50),
                new Greeter("Witaj", 50),
                new Greeter("Witaj", 50),
                new Greeter("Witaj", 50)
        };
        System.out.println("Cw 9 in order");
        ThreadRunner.runInOrder(tasks);
        System.out.println("Cw 9 together");
        ThreadRunner.runTogether(tasks);
    }
}
