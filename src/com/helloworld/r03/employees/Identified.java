package com.helloworld.r03.employees;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); }
}
