package com.helloworld.r03;

public interface IntSequence {
    default boolean hasNext() { return true; };
    int next();

    static IntSequence of(int... values) {
        return new IntSequence(){
            int[] vals = values;
            int index = -1;
            public boolean hasNext(){ return vals.length < index; }
            public int next(){
                index += 1;
                return vals[index]; }
        };
    }

}