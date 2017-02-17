package com.annakondratenko.app.homework.Lesson7;

/**
 * Created by annak on 12.02.2017.
 */
public class Task2cCreate2DimensionalArray {
    public int maxTwoDimensionalValueFinder(int[][] arr) {
        int maxVal = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                if (arr[j][k] > maxVal) {
                    maxVal = arr[j][k];
                }

            }

        }
        System.out.println("\n max " + maxVal);
        return maxVal;

    }

    public int minTwoDimensionalValueFinder(int[][] arr) {
        int minVal = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                if (arr[j][k] < minVal) {
                    minVal = arr[j][k];
                }

            }

        }
        System.out.println("\n min " + minVal);
        return minVal;

    }
}
