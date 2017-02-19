package com.annakondratenko.app.homework.Lesson9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by annak on 19.02.2017.
 */
public class ArrayParser {
    private int[] intArray;
    private String result = "Sorted array is ";

    public void scanAndPars() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] splittedStringArray = userInput.split(",");
        intArray = new int[splittedStringArray.length];
        for (int i = 0; i < splittedStringArray.length; i++) {
            intArray[i] = Integer.valueOf(splittedStringArray[i]);
        }
        System.out.println("Your input is " + Arrays.toString(intArray));

    }

    public void sortIntArrayFromAToZ() {
        Arrays.sort(intArray);

        System.out.println(result + Arrays.toString(intArray));
    }

    public int sortFromZtoA() {
        int i, j, first, temp;
        int n = intArray.length;
        for (i = intArray.length - 1; i > 0; i--) {
            first = 0;   //initialize to subscript of first element
            for (j = 1; j <= i; j++)   //locate smallest element between positions 1 and i.
            {
                if (intArray[j] < intArray[first])
                    first = j;
            }
            temp = intArray[first];   //swap smallest found with element in position i.
            intArray[first] = intArray[i];
            intArray[i] = temp;
        }
        System.out.println(result + Arrays.toString(intArray));

        return n;
    }
}
