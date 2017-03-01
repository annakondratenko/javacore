package com.annakondratenko.app.classwork.Lesson12;

/**
 * Created by annak on 27.02.2017.
 */
public class Student extends Person {
    private String university;
    private String response = "What the question?";

    public Student(String university, String name) {
        super(name);
        this.university = university;

    }

    public String getResponse() {
        return response;
    }
}
