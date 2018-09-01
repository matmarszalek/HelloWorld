package com.helloworld.r04.tasks;

import java.lang.reflect.*;

public class ReflectionHelloWorld {

    public ReflectionHelloWorld() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object out = System.out;
        Method m = System.out.getClass().getMethod("println", String.class);
        m.invoke(out, "Hello World");
    }

    public void printValues(Method m, int ceiling, int floor, int step) throws InvocationTargetException, IllegalAccessException {

        for(int i = floor; i < ceiling; i+=step)
            System.out.println(m.invoke(i));
    }
}
