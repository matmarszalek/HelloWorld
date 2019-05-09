package com.helloworld.r04.tasks.shapes;

import com.helloworld.r04.tasks.Point;

public class Line extends Shape {

    private Point from;
    private Point to;

    public Line(Point from, Point to){
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCentre() {
        return new Point((to.getX() - from.getX())/2.0, (to.getY() - from.getY())/2.0);
    }
}
