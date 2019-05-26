package com.annakondratenko.app.homework.Lesson4;

import com.annakondratenko.app.classwork.Lesson4.AppSelector;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by annak on 29.01.2017.
 */
public class AppSelectorTest {
    @Test
    public void appSelector4() {
        AppSelector appSelector = new AppSelector();
        String input = "4"; //String object created with value 4
        // String 4 converted to Byte order with input.getBytes()
        // ByteArrayInputStream extends InputStream
        // ByteArrayInputStream get bytes array and put into stream
        // and creates object InputStream in.
        InputStream in = new ByteArrayInputStream(input.getBytes());
        // System.setIn(in) Reassigns the "standard" input stream.
        System.setIn(in); // using InputStream class due to Scanner class in test
        Assert.assertEquals(4, appSelector.appSelector());
    }




}