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

    public double getY() {
        return y;
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
        if(other.getX() != this.getX())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
