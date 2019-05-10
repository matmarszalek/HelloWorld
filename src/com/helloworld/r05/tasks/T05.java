package com.helloworld.r05.tasks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class T05 {

    public void scanAndWrite(String inputFilename, String outputFilename) {
        Scanner in = null;
        PrintWriter writer = null;
        try {
            try {
                in = new Scanner(Paths.get(inputFilename));
                writer = new PrintWriter(outputFilename);
                while (in.hasNext()) {
                    System.out.println(in.next().toLowerCase());
                }
            } finally {
                if (in != null) {
                    in.close();
                }
                if (writer != null) {
                    in.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
