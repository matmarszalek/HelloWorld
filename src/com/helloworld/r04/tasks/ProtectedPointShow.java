package com.helloworld.r04.tasks;

import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.util.Scanner;

public class ProtectedPointShow extends TaskRunner{
    public ProtectedPointShow(ChapterRunner owner) {
        super(owner);
    }

    @Override
    public void run(Scanner in) {
        Point p = new Point(1,2);
        LabeledPoint lp = new LabeledPoint("123", p.x, p.y);
    }
}
