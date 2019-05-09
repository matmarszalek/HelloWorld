package com.helloworld.r04.tasks.shapes;

import com.helloworld.r04.tasks.Point;

public class Circle extends Shape{

    private Point centre;
    private double diameter;

    public Circle(Point centre, double diameter){
        this.centre = centre;
        this.diameter = diameter;
    }

    @Override
    public Point getCentre() {
        return centre;
    }
}
