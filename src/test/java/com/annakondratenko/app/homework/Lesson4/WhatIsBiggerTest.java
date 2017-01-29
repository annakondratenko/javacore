package com.annakondratenko.app.homework.Lesson4;

import com.annakondratenko.app.classwork.Lesson4.WhatIsBigger;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by annak on 30.01.2017.
 */
public class WhatIsBiggerTest {
    @Test
    public void iSBigger() {
        WhatIsBigger.iSBigger();
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String input2 = "5";
        InputStream in2 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in2);
        //Assert.assertEquals("Digit1 is bigger ",???);
    }

}