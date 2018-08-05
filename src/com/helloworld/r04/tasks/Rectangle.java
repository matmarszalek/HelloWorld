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
    public Point getCenter() {
        return new Point(this.point.getX() + width/2.0, this.point.getY() - height/2.0);
    }
}
