package com.annakondratenko.runners.homework.Lesson17;

import com.annakondratenko.app.homework.Lesson17.UniversityCart;

/**
 * Created by annak on 14.03.2017.
 */
public class UniversityCartRunner {
    public static void main(String[] args) {
        String searchKey;
        searchKey = "Petro";
        String [] studentsSurname =  {"Ivanov","Sidorov"};
        String []studentsName = {"Petro", "Vasyl"};
        UniversityCart <String> students = new UniversityCart<>(studentsName, studentsSurname);
        students.searchByName(searchKey);


        String [] emplSurname =  {"Robin","Stat"};
        String []emplName = {"John", "Tod"};
        searchKey = "Tod";
        UniversityCart <String> employer = new UniversityCart<>(emplName, emplSurname);
        students.searchByName(searchKey);
    }
}
