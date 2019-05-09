package com.helloworld.r05.tasks;

import java.io.IOException;
import java.util.ArrayList;

public class T04 {


    public double sumOfValues(String filename) {
        ArrayList<Double> values = null;
        try {
            values = T01.readValues(filename);
            double sum = 0.0;
            for(Double val:values){
                sum += val;
            }
            return sum;
        } catch (IOException e) {
            return 1;
        } catch(NumberFormatException e){
            return 2;
        }
    }
}
