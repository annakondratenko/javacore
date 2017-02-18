package com.annakondratenko.app.classwork.Lesson9;

import java.util.Arrays;

/**
 * Created by annak on 16.02.2017.
 */
public class StringSplit {
    public void stringToInt(String inputString){
        String[] splittedStringArray = inputString.split(",");

        int[] intArray = new int[splittedStringArray.length];

        for (int i = 0; i < splittedStringArray.length; i++) {
            intArray[i] = Integer.valueOf(splittedStringArray[i]);
        }
        System.out.println("Integers array: " + Arrays.toString(intArray));
        int count = 0;
        for (int i=0;i<splittedStringArray.length;i++){
            count++;
        }
        System.out.println("The number of entered integers is "+count);

    }

    public void splitWordsInString(String arrayString){
        String[] splittedStringArray = arrayString.split(" ");
        int count = 0;
         for (int i=0;i<splittedStringArray.length;i++){
             count++;
         }
        System.out.println("The number of words in your text is "+count);
                System.out.println("String array: "+ Arrays.toString(splittedStringArray )

                .replace("[", "")
                .replace("!", "")
                .replace("  ", "")
                .replace("]", ""));
    }


}