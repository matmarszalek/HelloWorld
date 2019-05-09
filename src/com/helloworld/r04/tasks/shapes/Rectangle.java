package com.helloworld.r04.tasks.shapes;

import com.helloworld.r04.tasks.Point;

public class Rectangle extends Shape {

    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCentre() {
        return new Point(topLeft.getX() + width/2.0, topLeft.getY() - height/2.0);
    }
}
