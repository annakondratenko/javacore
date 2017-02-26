package com.annakondratenko.runners.homework.Lesson11;

import com.annakondratenko.app.homework.Lesson11.Human;

/**
 * Created by annak on 26.02.2017.
 */
public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human("Bibik", 0);
        human.setAge(30);
        System.out.println("name " + human.getName());
        System.out.println("age "+human.getAge());

    }
}
