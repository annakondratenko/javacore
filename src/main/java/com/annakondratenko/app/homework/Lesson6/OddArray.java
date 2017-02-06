package com.annakondratenko.app.homework.Lesson6;

import java.util.Arrays;

/**
 * Created by annak on 05.02.2017.
 */
public class OddArray {
    public static void printOddDigits(){
        int[] oddArray= new int [50];
        int maxOdd = 100;

        int count = 0;
        for(int i=0;i<maxOdd;i++) {
            if (i % 2 != 0) {
                oddArray[count] = i;
                count++;
                //System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        for (int i=0;i<oddArray.length;i++){
            System.out.print(oddArray[i]+" ");
        }
        System.out.println(" ");
        for (int i=oddArray.length-1;i>=0;i--){
            System.out.print(oddArray[i]+" ");
        }
    }
}

