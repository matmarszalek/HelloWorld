package com.helloworld.r03;

public class GreeterRunner {
    public GreeterRunner(){
            new Thread(new Greeter("Witaj", 50)).start();
            new Thread(new Greeter("No Elo", 10)).start();
    }
}
