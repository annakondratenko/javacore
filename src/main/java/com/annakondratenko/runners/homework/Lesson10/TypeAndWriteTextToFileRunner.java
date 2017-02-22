package com.annakondratenko.runners.homework.Lesson10;

import com.annakondratenko.app.classwork.Lesson10.TypeAndWriteTextToFile;

/**
 * Created by annak on 22.02.2017.
 */
public class TypeAndWriteTextToFileRunner {
    public static void main(String[] args) {
        System.out.println("Enter a file where you want to write your text (Important: use full path(e.g. D:\\TestFiles\\input.txt)");
        TypeAndWriteTextToFile typeAndWriteTextToFile = new TypeAndWriteTextToFile();
        typeAndWriteTextToFile.scanInputText();
        System.out.println("Type your text. \n \tThen type 'exit' when you are done.");
        typeAndWriteTextToFile.writeInputToFile();

    }
}
