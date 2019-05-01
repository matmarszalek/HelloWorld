package com.helloworld.r03;

import com.helloworld.r03.tasks.Greeter;
import com.helloworld.r03.tasks.IntSequence;
import com.helloworld.r03.tasks.LuckySorter;
import com.helloworld.runners.ChapterRunner;

import java.util.ArrayList;
import java.util.Comparator;

public class ChapterThreeRunner extends ChapterRunner {
    public ChapterThreeRunner(){

        IntSequence.of(1,2,3,4,5);

        ArrayList<String> list = new ArrayList<String>(){{add("bcd");
            add("ccd");
            add("abcd");}};
        LuckySorter.luckySort(list, Comparator.naturalOrder());

        Runnable greeter1 = new Greeter(10, "Pawel");
        Runnable greeter2 = new Greeter(5, "Andrzej");
        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);
        thread1.run();
        thread2.run();
    }
}
