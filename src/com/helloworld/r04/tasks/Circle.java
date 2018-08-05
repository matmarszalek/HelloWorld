package com.helloworld.r04.tasks;

public class Circle extends Shape {

    private final double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }
}
