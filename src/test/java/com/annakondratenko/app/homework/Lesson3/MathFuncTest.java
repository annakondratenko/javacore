package com.annakondratenko.app.homework.Lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by annak on 25.01.2017.
 */
public class MathFuncTest {
    @Test
    public void compareGraterIf()  {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(4,mathFunc.compareGrater(4,1));
    }
    @Test
    public void compareGraterElse() {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(6, mathFunc.compareGrater(4,6));
    }
    @Test
    public void addTwoInt () {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(499, mathFunc.addTwoInt(245, 254));
    }
    @Test
    public void divideTwoInt () {
        Assert.assertEquals(5, MathFunc.divideTwoInt(10, 2));
    }
    @Test
    public void multiplyTwoInt () {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(250, mathFunc.multiplyTwoInt(10, 25) );
    }
    @Test
    public void deductTwoInt () {
        MathFunc mathFunc = new MathFunc();
        int aaa = 85;
        Assert.assertEquals(85, mathFunc.deductTwoInt(aaa, 0));
    }
    @Test
    public void isEqualTrue () {
        MathFunc mathFunc = new MathFunc();
        int a = 20-15;
        int b = 1+4;
        Assert.assertEquals(true, mathFunc.isEqual(a,b));
    }
    @Test
    public void isEqualFalse () {
        MathFunc mathFunc = new MathFunc();
        int a = 5+5;
        int b = 5-5;
        Assert.assertEquals(false, mathFunc.isEqual(a,b));
    }
    @Test
    public void isEqualWithArrayTrue () {
        MathFunc mathFunc = new MathFunc();
        int array[] = {11,11,767,75};
        Assert.assertEquals(true, mathFunc.isEqualWithArray(array));
    }
    @Test
    public void isEqualWithArrayFalse () {
        MathFunc mathFunc = new MathFunc();
        int array[] = {0,1,2,3};
        Assert.assertEquals(false, mathFunc.isEqualWithArray(array));
    }
    @Test
    public void biggerThanZeroTrue () {
        MathFunc mathFunc = new MathFunc();
        int a = mathFunc.addTwoInt(0,1);
        Assert.assertEquals(true, mathFunc.biggerThanZero(a));
    }

    @Test
    public void isNotEmptyTrue () {
        MathFunc mathFunc = new MathFunc();
        int a = mathFunc.multiplyTwoInt(1,1);
        Assert.assertEquals(true, mathFunc.isNotEmpty(a));
    }

    @Test
    public void isNotEmptyFalse () {
        MathFunc mathFunc = new MathFunc();
        int a = mathFunc.deductTwoInt(10,10);
        Assert.assertEquals(false, mathFunc.isNotEmpty(a));
    }

    @Test
    public void biggerThanZeroFalse () {
        MathFunc mathFunc = new MathFunc();
        int a = mathFunc.deductTwoInt(800, 800);
        Assert.assertEquals(false, mathFunc.biggerThanZero(a));

    }
    @Test
    public void addLongAndInt (){
        MathFunc mathFunc = new MathFunc();
        long a = 3L;
        int b = 2;
        Assert.assertEquals(5L, mathFunc.addLongAndInt(3L,2));

    }

}