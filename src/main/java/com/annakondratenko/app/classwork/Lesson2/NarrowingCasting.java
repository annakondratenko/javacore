package com.annakondratenko.app.classwork.Lesson2;

/**
 * Created by annak on 19.01.2017.
 */
public class NarrowingCasting {
     int int1 = 0;
    float float1 = 3.14159f;

    public int narrowing(float fVar){
        int1 = (int) fVar;
        System.out.println(int1);
        return int1;
    }
    public static void main (String[] args){
        NarrowingCasting narrowingCasting = new NarrowingCasting();
        narrowingCasting.narrowing(3.55f);

    }
}
