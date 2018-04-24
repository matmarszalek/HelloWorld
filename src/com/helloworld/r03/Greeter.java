package com.helloworld.r03;

public class Greeter implements Runnable{
    int n;
    String greeting;

    public Greeter(String greeting, int n){
        this.n = n;
        this.greeting = greeting;
    }

    @Override
    public void run() {
        for(int i=0; i<n; i++)
        System.out.println(greeting);
    }
}
