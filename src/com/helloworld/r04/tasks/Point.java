package com.helloworld.r04.tasks;

import java.util.Objects;

public class Point {
    protected double x, y;

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

    public String toString(){
        return getClass().getName() + " [" + x + ", " + y + "]";
    }

    public boolean equals(Point another){
        return this == another ||
                another != null &&
                this.getX() == another.getX() &&
                this.getY() == another.getY();
    }

    public int hashCode(){
        return Objects.hash(this.x, this.y);
    }
}
