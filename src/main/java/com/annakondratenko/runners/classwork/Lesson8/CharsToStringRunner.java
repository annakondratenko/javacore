package com.annakondratenko.runners.classwork.Lesson8;

import com.annakondratenko.app.classwork.Lesson8.CharsToString;

/**
 * Created by annak on 13.02.2017.
 */
public class CharsToStringRunner {
    public static void main(String[] args) {
        char[] charArrayToString = {'a','b','c','d'};
        CharsToString charsToString = new CharsToString();
        charsToString.convertCharToString(charArrayToString);
    }
}
