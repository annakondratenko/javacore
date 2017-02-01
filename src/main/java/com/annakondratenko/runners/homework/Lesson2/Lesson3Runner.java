package com.annakondratenko.runners.homework.Lesson2;

/**
 * Created by annak on 21.01.2017.
 */
import com.annakondratenko.app.classwork.Lesson2.NarrowingCasting;
import com.annakondratenko.app.classwork.Lesson2.WideningCasting;
import com.annakondratenko.app.homework.Lesson2.convertors.PrimitiveConvertor;
public class Lesson3Runner {
    public static void main (String args[]){
        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();
        char cVal = primitiveConvertor.floatToChar(33f);
        int iVal = primitiveConvertor.charToInt('#');
        char cVal1 = primitiveConvertor.intToChar(62);

    WideningCasting wdnCast  = new WideningCasting();
    byte sendByte1 = 3;
    wdnCast.widening(sendByte1);

    NarrowingCasting narrowingCasting = new NarrowingCasting();
        narrowingCasting.narrowing(33.5f);

    }
}
