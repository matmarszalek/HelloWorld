package com.helloworld.r02;

import java.math.BigDecimal;

/**
 * Class representing a Point.
 */
public class Point {
    static BigDecimal x;
    static BigDecimal y;

    /**
     * Default constructor of the class Point
     */
    public Point(){
        this.x = BigDecimal.ZERO;
        this.y = BigDecimal.ZERO;
    }

    /**
     * The contructor of the class Point. Parameters are
     * the first and the second coordinate of the class
     * @param x - BigDecimal, the x value of the point
     * @param y - BigDecimal, the x value of the point
     */
    public Point(BigDecimal x, BigDecimal y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return the X value of the point
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * @return the Y value of the point
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * Translates the point by x and y values
     * @param x
     * @param y
     * @return new instance of a Point, with translated coordinates
     */
    public Point translate(BigDecimal x, BigDecimal y){
        BigDecimal newX = getX().add(x);
        BigDecimal newY = getY().add(y);

        return new Point(newX, newY);
    }

    /**
     * Scales the point by the given scale
     * @param scale - the scale by which the point coordinates should be multiplied
     * @return new instance of a Point, with scaled coordinates
     */
    public Point scale(BigDecimal scale){
        BigDecimal newX = getX().multiply(scale);
        BigDecimal newY = getY().multiply(scale);

        return new Point(newX, newY);
    }
}
