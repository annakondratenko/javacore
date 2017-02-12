package com.annakondratenko.app.homework.Lesson7;

import com.annakondratenko.app.homework.Lesson6.RandomNumber;

/**
 * Created by annak on 12.02.2017.
 */
public class Task2c_Create2DimensionalArray {
    public int maxTwoDimensionalValueFinder(int[][]arr){
        int maxVal = arr[0][0];
        for(int j=0; j<arr.length; j++){
           // System.out.println(" ");
            for (int k=0; k<arr[j].length; k++){
                //System.out.print(arr[j][k]+" ");
                if (arr[j][k]>maxVal){
                    maxVal=arr[j][k];
                }

            }

        }
        System.out.println("\n max "+ maxVal);
        return maxVal;

    }
    public int minTwoDimensionalValueFinder(int[][]arr){
        int minVal = arr[0][0];
        for(int j=0; j<arr.length; j++){
            // System.out.println(" ");
            for (int k=0; k<arr[j].length; k++){
                //System.out.print(arr[j][k]+" ");
                if (arr[j][k]<minVal){
                    minVal=arr[j][k];
                }

            }

        }
        System.out.println("\n min "+ minVal);
        return minVal;

    }
}
