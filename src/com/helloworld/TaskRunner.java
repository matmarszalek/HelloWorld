package com.helloworld;

import java.util.Scanner;

public abstract class TaskRunner {
    ChapterRunner owner;

    public TaskRunner(ChapterRunner owner){
        this.owner = owner;
        this.owner.addObject(this);
    }
    public abstract void run(Scanner in);
}
