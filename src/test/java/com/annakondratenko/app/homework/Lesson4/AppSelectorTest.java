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
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(4, AppSelector.appSelector());
    }



}