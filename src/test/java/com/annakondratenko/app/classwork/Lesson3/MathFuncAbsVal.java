package com.annakondratenko.app.classwork.Lesson3;

import com.annakondratenko.app.homework.Lesson3.MathFunc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by annak on 26.05.2019.
 */
public class MathFuncAbsVal {
    @Test
    public void absVal(){
        MathFunc absValTest = new MathFunc();
        assertEquals(6, absValTest.absoluteValue(-6));
    }
}
