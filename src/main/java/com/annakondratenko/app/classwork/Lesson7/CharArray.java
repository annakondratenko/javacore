package com.annakondratenko.app.classwork.Lesson7;

import java.util.Arrays;

/**
 * Created by annak on 09.02.2017.
 */
public class CharArray {
    public int charArray (char[]arr) {
       int n = arr.length;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (char)i;
        }
        System.out.println("Char array: " + Arrays.toString(arr));
        return n;
    }
}
