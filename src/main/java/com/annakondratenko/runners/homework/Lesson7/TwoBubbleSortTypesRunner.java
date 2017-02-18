package com.annakondratenko.runners.homework.Lesson7;

import com.annakondratenko.app.homework.Lesson6.RandomNumber;
import com.annakondratenko.app.homework.Lesson7.ArrayPrint;
import com.annakondratenko.app.homework.Lesson7.TwoBubbleSortTypes;

/**
 * Created by annak on 12.02.2017.
 */
public class TwoBubbleSortTypesRunner {
    public static void main(String[]args){
        int[] array = new int[15];
        final int minArrayVal = 1;
        final int maxArrayVal = 15;
        final String src ="Entry array: ";
        final String aTOz ="Array sorted from the smallest to the biggest: ";
        final String zTOa ="Array sorted from the biggest to the smallest: ";
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.simpleRandomArray(minArrayVal,maxArrayVal, array);
        TwoBubbleSortTypes twoBubbleSortTypes = new TwoBubbleSortTypes();
        //print1
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.printArray(array, src);
        //print2
        twoBubbleSortTypes.aTOzBubbleSorting(array);
        arrayPrint.printArray(array,aTOz );

        //print3
        twoBubbleSortTypes.zTOaBubbleSorting(array);
        arrayPrint.printArray(array, zTOa);

    }
}
