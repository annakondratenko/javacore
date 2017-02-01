package com.annakondratenko.app.classwork.Lesson2;

/**
 * Created by annak on 19.01.2017.
 */
public class WideningCasting {
    //correct conversion 64f<=32f<=64<=32<=16<=8
    private short short1;
    private int int1;
    private long long1;
    private float float1;
    private double double1;

    public double widening(byte getByte){
        double1 = float1 = long1 = int1 = short1 = getByte;
        System.out.println(double1);
        return double1;
    }









}
