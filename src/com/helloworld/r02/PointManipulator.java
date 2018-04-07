package com.helloworld.r02;

import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.math.BigDecimal;
import java.util.Scanner;

public class PointManipulator extends TaskRunner{
    public PointManipulator(ChapterRunner owner) {
        super(owner);
    }

    @Override
    public void run(Scanner in) {
        Point p = new Point(BigDecimal.valueOf(3),BigDecimal.valueOf(4)).translate(BigDecimal.valueOf(1), BigDecimal.valueOf(3)).scale(BigDecimal.valueOf(0.5));
        System.out.println(p.getX() + " " + p.getY());
    }
}
