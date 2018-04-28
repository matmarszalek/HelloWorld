package com.helloworld.other;

import java.util.Random;

public class HelloWorldRandomWriter implements Runnable{
    Random r = new Random();
    String[] targetArray = {"H", "e", "l", "l", "o"," ", "W", "o", "r", "l", "d"};
    String[] stringArray;

    public HelloWorldRandomWriter(){
        stringArray = new String[]{"", "", "", "", "", "", "", "", "", "", ""};
    }
    public void run(){
        int i = 0;
        int x;
        while(i < targetArray.length){
            if(!stringArray[i].equals(targetArray[i]))
                stringArray[i] = Character.toString((char) (r.nextInt(94) + 32));
            else
                i++;
            x = 0;
            System.out.println("\n");
            while(x < stringArray.length){
                System.out.print(stringArray[x]);
                x++;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
