package com.annakondratenko.app.homework.Lesson11;


/**
 * Created by annak on 25.02.2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
            System.out.println("New age is set");

        } else {
            System.out.println("Input is invalid");
        }

    }
}
