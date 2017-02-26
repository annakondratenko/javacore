package com.annakondratenko.app.homework.Lesson10;


import com.annakondratenko.app.homework.Lesson7.TwoBubbleSortTypes;

import java.io.*;
import java.util.Arrays;

/**
 * Created by annak on 21.02.2017.
 */
public class ArrayReader {
    private int[] intArray;

    public void toReadFileWithDigitsArray() {
        String line;
        String fileReader = "D:\\TestFiles\\input.txt";
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(fileReader)
            );

            while ((line = reader.readLine()) != null) {
                String[] splitedStringArray = line.split(",");
                intArray = new int[splitedStringArray.length];
                for (int i = 0; i < splitedStringArray.length; i++) {
                    intArray[i] = Integer.valueOf(splitedStringArray[i]);
                    // System.out.println(intArray[i]);
                }
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortingForReadFile() {
        TwoBubbleSortTypes twoBubbleSortTypes = new TwoBubbleSortTypes();
        twoBubbleSortTypes.aTOzBubbleSorting(intArray);
        System.out.println("Sorted array is");
        System.out.println(Arrays.toString(intArray));

    }

    public void writeSortedArrayToFile() throws IOException {

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\TestFiles\\output.txt")));
        for (int i = 0; i < intArray.length; i++) {
            writer.append(String.valueOf(intArray[i]));
            writer.newLine();
        }
        System.out.println("Check output file to be sure sorted array is written.");
        writer.close();
    }

}

