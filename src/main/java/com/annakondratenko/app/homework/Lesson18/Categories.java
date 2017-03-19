package com.annakondratenko.app.homework.Lesson18;

import com.annakondratenko.app.classwork.Lesson12.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by annak on 19.03.2017.
 */
public class Categories {
    String category;
    Map personalInfo;
    public Categories(String category){
        this.category = category;
        personalInfo = new HashMap<>();
    }
    public void addToMap(PersonInfo pInfo){
        personalInfo.put(pInfo.phoneNumber, pInfo);
    }

    //public PersonInfo getPersonInfoByPhone(String phone){
        //PersonInfo pInfo = personalInfo.get(phone);
        //return pInfo;
    //}
}
