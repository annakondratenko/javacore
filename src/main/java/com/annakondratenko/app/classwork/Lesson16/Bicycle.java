package com.annakondratenko.app.classwork.Lesson16;

/**
 * Created by annak on 09.03.2017.
 */
public interface Bicycle {
    String MODEL_NEW = "Sams";
    void changeCadance(int newVal);
    void changeGear(int newVal);
    default  void setSpeed(){
        System.out.println("Default val is 10km/h");
    }
    }

