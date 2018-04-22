package com.helloworld.runners;

import java.util.Scanner;

public abstract class TaskRunner {

    public TaskRunner(ChapterRunner owner){
        owner.addObject(this);
    }
    public abstract void run(Scanner in);
}
