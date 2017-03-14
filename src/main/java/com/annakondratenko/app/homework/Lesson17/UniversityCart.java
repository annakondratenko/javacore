package com.annakondratenko.app.homework.Lesson17;

/**
 * Created by annak on 14.03.2017.
 */
public class UniversityCart<U> {
    private U[] name;
    private U[] surname;

    public UniversityCart(U[] name, U[] surname) {
        this.name = name;
        this.surname = surname;
    }

    public <N, S> void searchByName(U searchValue) {
        for (int i = 0; i < surname.length; i++) {
            if (surname[i].equals(searchValue)){
                System.out.println(surname[i]);
            }
        }
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(searchValue)){
                System.out.println(name[i]);
            }
        }
    }
}
