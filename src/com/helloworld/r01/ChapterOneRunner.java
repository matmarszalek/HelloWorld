package com.helloworld.r01;

import com.helloworld.runners.ChapterRunner;

public class ChapterOneRunner extends ChapterRunner{

    public ChapterOneRunner(){
        new NumberConverter(this);
        new AngleNormalizer(this);
        new BiggestNumberFinder(this);
        new FactorialCounter(this);
        new PascalTriangle(this);
    }
}
