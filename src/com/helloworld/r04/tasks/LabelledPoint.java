package com.helloworld.r04.tasks;

public class LabelledPoint extends Point{
    String label;

    public LabelledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj))
            return false;
        LabelledPoint other = (LabelledPoint) obj;
        if(!other.getLabel().equals(this.getLabel()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        String wholePoint = getLabel() + Double.toString(getX()) + Double.toString(getY());
        return wholePoint.hashCode();
    }
}
