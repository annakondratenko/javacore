package com.annakondratenko.app.classwork.Lesson7;

/**
 * Created by annak on 09.02.2017.
 */
public class BubbleSorting {
    public int bubbleSort(int[] numArray) {
        int n = numArray.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        return n;
    }
}
