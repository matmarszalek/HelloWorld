package com.helloworld.r03;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();

    /**
     * Use a internal anonymous method in that
     * @param values
     * @return
     */
    static IntSequence of(int... values) {
        return new IntSequence(){
            int[] vals = values;
            int index = 0;

            public boolean hasNext(){ return vals.length > index; }
            public int next(){
                return vals[index++]; }
        };
    }

    /**
     * Use a lambda expression in that
     * @param value
     * @return
     */
    static IntSequence constant(int value){
        return () -> value;
    }

}