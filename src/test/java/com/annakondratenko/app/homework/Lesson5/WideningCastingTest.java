package com.annakondratenko.app.homework.Lesson5;

import com.annakondratenko.app.classwork.Lesson2.WideningCasting;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by annak on 31.01.2017.
 */

public class WideningCastingTest {
    @Test
      public void widening (){
        WideningCasting wideningCasting = new WideningCasting();
        byte sendByte = 35;
        Assert.assertEquals(35.0,wideningCasting.widening(sendByte),0);
    }
}