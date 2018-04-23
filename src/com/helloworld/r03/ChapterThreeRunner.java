package com.helloworld.r03;

import com.helloworld.runners.ChapterRunner;

import java.util.Arrays;

public class ChapterThreeRunner extends ChapterRunner {
    public ChapterThreeRunner(){
        new Company(this);
        System.out.println(Arrays.toString(IntSequence.of(1,2,3,4)));
    }
}
