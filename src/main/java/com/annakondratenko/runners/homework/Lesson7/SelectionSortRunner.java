package com.annakondratenko.runners.homework.Lesson7;

import com.annakondratenko.app.homework.Lesson6.RandomNumber;
import com.annakondratenko.app.homework.Lesson7.ArrayPrint;
import com.annakondratenko.app.homework.Lesson7.SelectionSort;

/**
 * Created by annak on 12.02.2017.
 */
public class SelectionSortRunner {
    public static void main(String[] arr) {
        int[] array = new int[10];
        final int minArrVal = 1;
        final int maxArrVal = 100;
        final String entryVal = "Entry array values: ";
        final String outputVal = "Array sorted by \"selection sort\" : ";
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.simpleRandomArray(minArrVal, maxArrVal, array);
        ArrayPrint arrayPrint = new ArrayPrint();
        arrayPrint.printArray(array, entryVal);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sortFromZtoA(array);
        arrayPrint.printArray(array, outputVal);

    }
}
