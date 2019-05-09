package com.helloworld.r05.tasks;

import java.io.*;
import java.util.ArrayList;

public class T01 {

    public static ArrayList<Double> readValues(String filename) throws IOException, NumberFormatException {
        ArrayList<Double> values = new ArrayList<>();
        File file = new File(filename);

        try(BufferedReader in = new BufferedReader(new FileReader(file))){
            String value;
            while((value = in.readLine()) != null)
            {
                values.add(Double.parseDouble(value));
            }
        }
        return values;
    }
}
