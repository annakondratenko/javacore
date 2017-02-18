package com.annakondratenko.runners.classwork.Lesson9;

import com.annakondratenko.app.classwork.Lesson9.StringSplit;

import java.util.Scanner;

/**
 * Created by annak on 16.02.2017.
 */
public class StringSplitRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("\tEnter numbers using comma delimiter.  This app will read your text and output it like an array of String symbols");
        String inputString = scanner.nextLine();
        StringSplit stringSplit = new StringSplit();
        stringSplit.stringToInt(inputString);
        System.out.println ("\tEnter non-digits symbols. This app will read your text and output it like an array of String symbols.");
        String inputString2 = scanner.nextLine();
        stringSplit.splitWordsInString(inputString2);
    }
}
