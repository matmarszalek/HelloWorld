package com.helloworld.r03.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LuckySorter {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comparator){
        boolean shuffle = true;
        String prev;

        OUTER_LOOP:
        while(shuffle){
            Collections.shuffle(strings);
            System.out.println(strings);
            prev = null;
            for (String string : strings){
                if (prev == null){
                    prev = string;
                    continue;
                }
                System.out.println(comparator.compare(prev, string));
                if (comparator.compare(prev, string) > 0)
                    continue OUTER_LOOP;
                prev = string;
            }
            shuffle = false;
        }

        System.out.println(strings);
    }
}
