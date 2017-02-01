package com.annakondratenko.app.homework.Lesson5;

import com.annakondratenko.app.homework.Lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by annak on 01.02.2017.
 */
@RunWith(JUnitParamsRunner.class)

public class ParametrizedTest {
    private MathFunc mathFunc = null;

    @Before
    public void setUp() {
        mathFunc = new MathFunc();
    }

    @Test
    @FileParameters(value = "src/test/resources/compareGrater.csv", mapper = CsvWithHeaderMapper.class)
    public void compareGrater(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.compareGrater(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/biggerThanZero.csv", mapper = CsvWithHeaderMapper.class)
    public void biggerThanZero(int a, boolean expected) {
        Assert.assertEquals(expected, mathFunc.biggerThanZero(a));
    }

    @Ignore
    @Test
    @FileParameters(value = "src/test/resources/isEqualWithArray.csv", mapper = CsvWithHeaderMapper.class)
    public void isEqualWithArray(int[] a, boolean expected) {
        Assert.assertEquals(expected, mathFunc.isEqualWithArray(a));
    }

    @Test
    @FileParameters(value = "src/test/resources/isNotEmpty.csv", mapper = CsvWithHeaderMapper.class)
    public void isNotEmpty(int a, boolean expected) {
        Assert.assertEquals(expected, mathFunc.isNotEmpty(a));
    }

    @Test
    @FileParameters(value = "src/test/resources/addTwoInt.csv", mapper = CsvWithHeaderMapper.class)
    public void addTwoInt(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.addTwoInt(a,b));
    }

    @Test
    @FileParameters(value = "src/test/resources/divideTwoInt.csv", mapper = CsvWithHeaderMapper.class)
    public void divideTwoInt(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.divideTwoInt(a,b));
    }

    @Test
    @FileParameters(value = "src/test/resources/deductTwoInt.csv", mapper = CsvWithHeaderMapper.class)
    public void deductTwoInt(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.deductTwoInt(a,b));
    }
    @Ignore
    @Test
    @FileParameters(value = "src/test/resources/isEqual.csv", mapper = CsvWithHeaderMapper.class)
    public void isEqual(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.isEqual(a,b));
    }

    @Ignore
    @Test
    @FileParameters(value = "src/test/resources/addLongAndInt.csv", mapper = CsvWithHeaderMapper.class)
    public void addLongAndInt(long a, int b, long expected) {
        Assert.assertEquals(expected, mathFunc.addLongAndInt(a,b));
    }

    @Test
    @FileParameters(value = "src/test/resources/absoluteValue.csv", mapper = CsvWithHeaderMapper.class)
    public void absoluteValue(int a, int expected) {
        Assert.assertEquals(expected, mathFunc.absoluteValue(a));
    }

    @Test
    @FileParameters(value = "src/test/resources/roundingUp.csv", mapper = CsvWithHeaderMapper.class)
    public void roundingUp(double a, double expected) {
        Assert.assertEquals(expected, mathFunc.roundingUp(a), 0);
    }

    @Test
    @FileParameters(value = "src/test/resources/returnMaxVal.csv", mapper = CsvWithHeaderMapper.class)
    public void returnMaxVal(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.returnMaxVal(a,b));
    }

    @Test
    @FileParameters(value = "src/test/resources/returnMinVal.csv", mapper = CsvWithHeaderMapper.class)
    public void returnMinVal(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunc.returnMinVal(a,b));
    }

    @Test
    @FileParameters(value = "src/test/resources/raiseFirstInt.csv", mapper = CsvWithHeaderMapper.class)
    public void raiseFirstInt(int a, int b, double expected) {
        Assert.assertEquals(expected, mathFunc.raiseFirstInt(a,b),0);
    }
}





