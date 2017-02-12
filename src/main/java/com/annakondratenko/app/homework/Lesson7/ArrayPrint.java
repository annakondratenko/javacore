package com.annakondratenko.app.homework.Lesson7;

import com.annakondratenko.app.homework.Lesson6.RandomNumber;

import java.util.Arrays;

/**
 * Created by annak on 12.02.2017.
 */
public class ArrayPrint {
    public void printArray(int[]arr, String name){
        System.out.println(name + Arrays.toString(arr));
    }
    public void printTwoDimensionalArray(int[][]arr, String name){
        for(int j=0; j<arr.length; j++){
            System.out.println(" ");
            for (int k=0; k<arr[j].length; k++){

                System.out.print(arr[j][k]+" ");

            }

        }
    }
}
