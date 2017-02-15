package com.annakondratenko.runners.homework.Lesson7;

import com.annakondratenko.app.homework.Lesson6.RandomNumber;
import com.annakondratenko.app.homework.Lesson7.ArrayPrint;
import com.annakondratenko.app.homework.Lesson7.Task2cCreate2DimensionalArray;

/**
 * Created by annak on 12.02.2017.
 */
public class Task2c_Create2DimensionalArrayRunner {
    public static void main(String[] arr) {
        int[][] array = new int[5][8];
        final int minArrVal = -99;
        final int maxArrVal = 99;
        final String entryVal = "Entry array values: ";
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.multidimensionalRandomArray(minArrVal, maxArrVal, array);
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.printTwoDimensionalArray(array, entryVal);
        Task2cCreate2DimensionalArray task2c_create2DimensionalArray = new Task2cCreate2DimensionalArray();
        task2c_create2DimensionalArray.maxTwoDimensionalValueFinder(array);
        task2c_create2DimensionalArray.minTwoDimensionalValueFinder(array);

    }
}