package com.annakondratenko.app.homework.Lesson5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageUtilTest {

    String message1 = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message1);

    @Test
    public void testPrintMessage() {
        assertEquals(message1,messageUtil.printMessage());
    }
}