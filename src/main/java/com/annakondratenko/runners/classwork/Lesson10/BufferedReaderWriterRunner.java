package com.annakondratenko.runners.classwork.Lesson10;

import com.annakondratenko.app.classwork.Lesson10.BufferedReaderMyOwn;
import com.annakondratenko.app.classwork.Lesson10.BufferedWriterMyOwn;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by annak on 20.02.2017.
 */
public class BufferedReaderWriterRunner {
    public static void main(String[] args) throws IOException {
        BufferedReaderMyOwn bufferedReader = new BufferedReaderMyOwn();
        try {
            bufferedReader.readInpuTXTFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedWriterMyOwn bufferedWriterMyOwn = new BufferedWriterMyOwn();
        try {
            bufferedWriterMyOwn.writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
