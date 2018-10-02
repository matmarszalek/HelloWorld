package com.helloworld.runners;

import java.util.ArrayList;
import java.util.Scanner;

public class ChapterRunner {
    ArrayList<TaskRunner> tasks = new ArrayList<>();

    public void addObject(TaskRunner obj){
        tasks.add(obj);
    }

    /**
     * Runs the chapter
     * @param in
     */
    public void runChapter(Scanner in){
        for(TaskRunner task : tasks)
            task.run(in);
    }
}
