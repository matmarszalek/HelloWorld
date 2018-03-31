package com.helloworld.r01;

import com.helloworld.ChapterRunner;

public class ChapterOneRunner extends ChapterRunner{
    NumberConverter conv;
    AngleNormalizer norm;
    BiggestNumberFinder finder;
    FactorialCounter facounter;

    public ChapterOneRunner(){
        conv = new NumberConverter(this);
        norm = new AngleNormalizer(this);
        finder = new BiggestNumberFinder(this);
        facounter = new FactorialCounter(this);
    }
}
