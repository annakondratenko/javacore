package com.annakondratenko.app.classwork.Lesson5;

import com.annakondratenko.app.classwork.Lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by annak on 30.01.2017.
 */
@RunWith(JUnitParamsRunner.class)

public class ParametrizedTest {
    private MathFunc mathFunc = null;

    @Before
    public void setUp() {
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/multiply.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.multiply(a, b));
    }


}
