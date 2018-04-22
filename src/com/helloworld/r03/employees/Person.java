package com.helloworld.r03.employees;

public interface Person {
    String getName();
    default int getId() { return 0; }
}