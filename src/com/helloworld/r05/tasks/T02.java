package com.helloworld.r05.tasks;

import java.io.IOException;
import java.util.ArrayList;

public class T02 {

    public double sumOfValues(String filename) throws IOException {
        ArrayList<Double> values = T01.readValues(filename);
        double sum = 0.0;
        for(Double val:values){
            sum += val;
        }
        return sum;
    }
}
