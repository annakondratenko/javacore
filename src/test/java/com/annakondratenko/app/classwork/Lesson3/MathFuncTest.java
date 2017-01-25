package com.annakondratenko.app.classwork.Lesson3;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by annak on 23.01.2017.
 */
public class MathFuncTest {
    @Test
    public void multiply(){
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(6, mathFunc.multiply(2,3));
    }
}