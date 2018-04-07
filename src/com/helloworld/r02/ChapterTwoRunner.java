package com.helloworld.r02;

import com.helloworld.runners.ChapterRunner;

public class ChapterTwoRunner extends ChapterRunner {

    public ChapterTwoRunner(){
        new CalendarWriter(this);
        new PointManipulator(this);
    }
}
