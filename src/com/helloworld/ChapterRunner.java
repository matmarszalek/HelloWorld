package com.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class ChapterRunner {
    ArrayList<TaskRunner> tasks = new ArrayList<>();

    public void addObject(TaskRunner obj){
        tasks.add(obj);
    }
    public void runChapter(){
        for(TaskRunner task : tasks)
            task.run();
    }
}
