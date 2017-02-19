package com.annakondratenko.runners.classwork.Lesson9;

import com.annakondratenko.app.classwork.Lesson9.StringBuilderWrapper;

/**
 * Created by annak on 16.02.2017.
 */
public class StringBuilderRunner {
    public static void main(String[] args) {
        String testWord = "unfortunately";
        StringBuilderWrapper stringBuilder = new StringBuilderWrapper();
        stringBuilder.measureStringBuilderPerformance();
        stringBuilder.appendStringBuilder();
        stringBuilder.editStringBuilder(testWord);
        stringBuilder.charArrayToString();
    }
}
