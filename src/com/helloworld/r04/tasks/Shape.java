package com.helloworld.r04.tasks;

public abstract class Shape {
    Point point;

    public Shape(Point point){
        this.point = point;
    }

    public void moveBy (double dx, double dy){
        this.point.x += dx;
        this.point.y += dy;
    }

    public abstract Point getCenter();
}
