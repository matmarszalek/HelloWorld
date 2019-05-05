package com.helloworld.r04.tasks;

public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj))
            return false;
        Point other = (Point) obj;
        if(other.getX() != this.getX() || other.getY() != this.getY())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        String wholePoint = Double.toString(getX()) + Double.toString(getY());
        return wholePoint.hashCode();
    }
}
