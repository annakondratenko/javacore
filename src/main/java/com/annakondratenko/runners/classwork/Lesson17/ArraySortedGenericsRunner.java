package com.annakondratenko.runners.classwork.Lesson17;

import com.annakondratenko.app.classwork.Lesson17.ArraySorterGenerics;

import java.util.Arrays;

/**
 * Created by annak on 13.03.2017.
 */
public class ArraySortedGenericsRunner {
    public static void main(String[] args) {
        Integer[] arrayInteger = {2, 10, 72, 2, 9, 40, 48, 5, 5, 49};
        Float[] arrF = {2f, 10f, 72f, 2f, 9f, 40f, 48f, 5f, 5f, 49f};
        Double[] arrD = {34.0, 45.6, 4.6, 7.0, 56.7};
        ArraySorterGenerics<Integer> arrInt = new ArraySorterGenerics<>(arrayInteger);
        ArraySorterGenerics<Float> arrFloat = new ArraySorterGenerics<>(arrF);
        ArraySorterGenerics<Double> arrDouble = new ArraySorterGenerics<>(arrD);


        System.out.println(Arrays.toString(arrInt.arrayBubbleSortAscending(arrayInteger)));
        System.out.println(Arrays.toString(arrFloat.arrayBubbleSortAscending(arrF)));
        System.out.println(Arrays.toString(arrDouble.arrayBubbleSortAscending(arrD)));

    }
}