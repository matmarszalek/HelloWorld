package com.helloworld.r04.tasks;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class LabeledPoint extends Point{
    String label;

    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
    }

    public LabeledPoint(String label, @NotNull Point p){
        super(p.x, p.y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String toString(){
        return super.toString() + ": " + this.label;
    }

    public boolean equals(LabeledPoint another){
        return super.equals(another) &&
                this.getLabel().equals(another.getLabel());
    }

    public int hashCode(){
        return Objects.hash(super.hashCode(), this.getLabel());
    }
}
