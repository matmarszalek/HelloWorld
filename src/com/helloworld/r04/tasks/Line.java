package com.helloworld.r04.tasks;

public class Line extends Shape{
    private final Point to;

    public Line(Point from, Point to) {
        super(from);

        this.to = to;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        this.to.x += dx;
        this.to.y += dy;
    }
}
