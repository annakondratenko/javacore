package com.annakondratenko.runners.homework.Lesson10;

import com.annakondratenko.app.homework.Lesson10.Reader2Writer;

import java.io.FileNotFoundException;

/**
 * Created by annak on 22.02.2017.
 */
public class Reader2WriterRunner {
    public static void main(String[] args) {
        Reader2Writer reader2Writer = new Reader2Writer();
        try {
            reader2Writer.readInputFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
