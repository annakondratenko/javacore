package com.annakondratenko.app.homework.Lesson5;

import com.annakondratenko.app.homework.Lesson2.convertors.PrimitiveConvertor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annak on 01.02.2017.
 */
public class PrimitiveConvertorTest {
    @Test
    public void floatToChar()   {
        PrimitiveConvertor primCon = new PrimitiveConvertor();
        float fVar = 8.5f;
        Assert.assertEquals(8, primCon.floatToChar(fVar));

    }

    @Test
    public void intToChar()   {
        PrimitiveConvertor primCon = new PrimitiveConvertor();
        Assert.assertEquals('#' ,primCon.intToChar(35));
    }
    @Test
    public void charToInt()   {
        PrimitiveConvertor primCon = new PrimitiveConvertor();
        Assert.assertEquals(35, primCon.charToInt('#') );

    }

}