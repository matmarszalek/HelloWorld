package com.helloworld.r04.tasks.shapes;

import com.helloworld.r04.tasks.Point;

public abstract class Shape {
    Point[] points;

    public Shape(Point... points){
        this.points = points;
    }

    public void moveBy(double x, double y){
        for(Point point : this.points){
            point.setX(point.getX() + x);
            point.setY(point.getY() + y);
        }
    }

    public abstract Point getCentre();
}
