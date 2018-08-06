package com.helloworld.r04.tasks;

public class Rectangle extends Shape{

    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        Point pointCloned = new Point(this.point.getX(), this.point.getY());
        return new Rectangle(pointCloned, this.width, this.height);
    }

    @Override
    public Point getCenter() {
        return new Point(this.point.getX() + width/2.0, this.point.getY() - height/2.0);
    }
}
