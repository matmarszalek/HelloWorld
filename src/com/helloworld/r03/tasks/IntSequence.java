package com.helloworld.r03.tasks;

public class IntSequence {

    public interface ofInterface{
        void printNumbers();
    }

    /**
     * Use an anonymous method
     * @param numbers
     * @return
     */
    public static void of(int... numbers){
        ofInterface inter = new ofInterface() {
            public void printNumbers(){
                for(int i : numbers){
                    System.out.println(i);
                }
            }
        };
        inter.printNumbers();
    }

    public static void constant(int number){
        Runnable run = () -> {while(true)
            System.out.println(number);};
        run.run();
    }
}
