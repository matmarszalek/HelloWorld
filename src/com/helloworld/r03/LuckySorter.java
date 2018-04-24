package com.helloworld.r03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySorter {
    public void luckySort(ArrayList<String> strings, Comparator<String> comp){
        //while(comp.thenComparing(strings::get)){
            Collections.shuffle(strings);
        //}
    }
}
