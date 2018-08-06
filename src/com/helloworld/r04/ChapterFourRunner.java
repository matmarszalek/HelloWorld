package com.helloworld.r04;

import com.helloworld.r04.tasks.ReflectionHelloWorld;
import com.helloworld.runners.ChapterRunner;

import java.lang.reflect.InvocationTargetException;

public class ChapterFourRunner extends ChapterRunner{
    public ChapterFourRunner(){
        try {
            new ReflectionHelloWorld();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
