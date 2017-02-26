package com.annakondratenko.app.classwork.Lesson11;

/**
 * Created by annak on 23.02.2017.
 */
public class Student {
    private String name;
    private int age;
    private String school="High school";


    public void setName(String name){
        System.out.println("Student name is "+name);
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("Student age is "+age);
    }

    public String getSchool(){
        System.out.println("Student school is "+school);
        return school;
    }
}
