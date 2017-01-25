package com.annakondratenko.app.classwork.Lesson2;

/**
 * Created by annak on 19.01.2017.
 */
public class WideningCasting {
    //correct conversion 64f<=32f<=64<=32<=16<=8
    private byte aByte = 127;
    byte byte1 = 127;
    short short1 = 0;
    int int1 = 0;
    long long1 = 0L;
    float float1 = 0.0f;
    double double1 = 0.0d;

    public void widening(){
        double1 = float1 = long1 = int1 = short1 = byte1;
        System.out.println(double1);
    }

    public static void main (String[] args){


        WideningCasting wdnCast  = new WideningCasting();
        wdnCast.widening();
    }







}
