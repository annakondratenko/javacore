package com.annakondratenko.app.classwork.Lesson7;

import java.util.Arrays;

/**
 * Created by annak on 09.02.2017.
 */
public class SortingWithArrays {
    public int sortWithArrays(int[]array){

        Arrays.sort(array);

        System.out.println("Sorted array:" + Arrays.toString(array));
        return array.length;

    }

}