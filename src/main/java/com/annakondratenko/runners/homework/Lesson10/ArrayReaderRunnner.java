package com.annakondratenko.runners.homework.Lesson10;

import com.annakondratenko.app.homework.Lesson10.ArrayReader;

import java.io.IOException;

/**
 * Created by annak on 21.02.2017.
 */
public class ArrayReaderRunnner {
    public static void main(String[] args) {
        ArrayReader arrayReader = new ArrayReader();
        arrayReader.toReadFileWithDigitsArray();
        arrayReader.sortingForReadFile();
        try {
            arrayReader.writeSortedArrayToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
