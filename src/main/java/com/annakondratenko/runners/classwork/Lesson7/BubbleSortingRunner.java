package com.annakondratenko.runners.classwork.Lesson7;

import com.annakondratenko.app.classwork.Lesson7.BubbleSorting;
import com.annakondratenko.app.homework.Lesson6.RandomNumber;

import java.util.Arrays;

/**
 * Created by annak on 12.02.2017.
 */
public class BubbleSortingRunner {
    public static void main(String[] arr){
        int[] array = new int[5];
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.simpleRandomArray(1,10,array);
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.bubbleSort(array);
        new BubbleSortingRunner().printArray(array);
    }
    public void printArray(int[]arr){
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }
}
