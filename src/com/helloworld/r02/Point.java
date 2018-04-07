package com.helloworld.r02;

import java.math.BigDecimal;

public class Point {
    static BigDecimal x;
    static BigDecimal y;

    public Point(){
        this.x = BigDecimal.ZERO;
        this.y = BigDecimal.ZERO;
    }

    public Point(BigDecimal x, BigDecimal y){
        this.x = x;
        this.y = y;
    }

    public BigDecimal getX() {
        return x;
    }

    public BigDecimal getY() {
        return y;
    }

    public Point translate(BigDecimal x, BigDecimal y){
        BigDecimal newX = getX().add(x);
        BigDecimal newY = getY().add(y);

        return new Point(newX, newY);
    }

    public Point scale(BigDecimal scale){
        BigDecimal newX = getX().multiply(scale);
        BigDecimal newY = getY().multiply(scale);

        return new Point(newX, newY);
    }
}
