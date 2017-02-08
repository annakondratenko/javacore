package com.annakondratenko.app.classwork.Lesson2;

/**
 * Created by annak on 19.01.2017.
 */
public class NarrowingCasting {
    int int1;
    float float1;

    public int narrowing(float fVar){
        int1 = (int) fVar;
        System.out.println(int1);
        return int1;
    }
}
