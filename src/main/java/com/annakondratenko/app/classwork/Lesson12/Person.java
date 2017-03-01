package com.annakondratenko.app.classwork.Lesson12;

/**
 * Created by annak on 27.02.2017.
 */
public class Person {
    protected String name;
    public Person(String name){
        this.name = name;
    }
     public final void askAge(int age){
        System.out.println("Age is "+age);
    }
}
