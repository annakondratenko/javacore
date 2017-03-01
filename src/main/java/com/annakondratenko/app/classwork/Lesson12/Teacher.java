package com.annakondratenko.app.classwork.Lesson12;

/**
 * Created by annak on 27.02.2017.
 */
public class Teacher extends Person {
    private int classNumber;
    public Teacher (String name, int classNumber){
        super(name);
        this.classNumber = classNumber;
    }

     public final void specifyTeacherSpecialization(String specialization){
        System.out.println("Specialization is "+specialization);
        System.out.println("Class number is "+classNumber+"\n Teacher name "+name);
    }
}
