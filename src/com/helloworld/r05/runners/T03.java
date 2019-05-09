package com.helloworld.r05.runners;

import com.helloworld.r05.tasks.T02;
import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.io.IOException;
import java.util.Scanner;

public class T03 extends TaskRunner {
    public T03(ChapterRunner owner) {
        super(owner);
    }

    @Override
    public void run(Scanner in) {

        T02 readerTask = new T02();
        System.out.println("Insert a file name with the full path:");
        String filename = in.nextLine();
        try {
            readerTask.sumOfValues(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
