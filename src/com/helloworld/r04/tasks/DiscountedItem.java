package com.helloworld.r04.tasks;

import java.util.Objects;

public class DiscountedItem extends Item{
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if(otherObject instanceof Item)
            return super.equals(otherObject);
        DiscountedItem other = (DiscountedItem) otherObject;
        return discount == other.discount;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
