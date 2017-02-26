package com.annakondratenko.app.classwork.Lesson11;

/**
 * Created by annak on 23.02.2017.
 */
public class Bicycle {
    String owner;
    int ageCategory;

    public Bicycle(){
        ageCategory=3;
        owner="Valik";
    }
    public Bicycle(int ageCategory){
        this.ageCategory=ageCategory;
    }
    public Bicycle(String owner){
        this(10);
        this.owner = owner;
    }
}
