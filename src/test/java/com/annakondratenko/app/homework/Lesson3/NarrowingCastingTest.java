package com.annakondratenko.app.homework.Lesson3;

import com.annakondratenko.app.classwork.Lesson2.NarrowingCasting;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by annak on 25.01.2017.
 */
public class NarrowingCastingTest {
    @Test
    public void narrowing()  {
        NarrowingCasting narrowingCasting = new NarrowingCasting();
        float float1 = 3.14159f;
        Assert.assertEquals(3, narrowingCasting.narrowing(float1));

    }

}