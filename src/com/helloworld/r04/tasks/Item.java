package com.helloworld.r04.tasks;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        // Szybki test by sprawdzić czy obiekty są identyczne
        if (this == otherObject) return true;
        // Musi zwrócić false jeśli jawny parametr to null
        if (otherObject == null) return false;
        // Sprawdza czy otherObject to Item
        if (getClass() != otherObject.getClass()) return false;
        // Test czy zmienne instancji mają identyczne wartości
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
                && price == other.price;
    }

    public int hashCode() {
        return Objects.hash(description, price);
    }
}
