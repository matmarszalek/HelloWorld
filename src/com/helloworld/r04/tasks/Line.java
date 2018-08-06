package com.helloworld.r04.tasks;

public class Line extends Shape{
    private final Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        double newX = this.to.getX() - this.point.getX();
        double newY = this.to.getY() - this.point.getY();
        return new Point(newX, newY);
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        this.to.x += dx;
        this.to.y += dy;
    }

    @Override
    public Shape clone() {
        Point pointCloned = new Point(this.point.getX(), this.point.getY());
        Point toCloned = new Point(this.to.getX(), this.to.getY());
        return new Line(pointCloned, toCloned);
    }
}
