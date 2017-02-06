package com.annakondratenko.app.homework.Lesson6;

/**
 * Created by annak on 05.02.2017.
 */
public class PrintEvenRange {
    public static void printEvenFromArray() {
        int[] evenArray = {2,4,6,8,10,12,14,16,18,20};
       for (int i = 0; i<evenArray.length; i++) {
            System.out.print(evenArray[i]+" ");
       }
        System.out.println(" ");
       for (int intArray:evenArray){
           System.out.println(intArray + " ");
        }
    }
}
