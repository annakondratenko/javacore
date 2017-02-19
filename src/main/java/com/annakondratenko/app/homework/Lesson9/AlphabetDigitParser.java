package com.annakondratenko.app.homework.Lesson9;

import java.util.Scanner;

/**
 * Created by annak on 19.02.2017.
 */
public class AlphabetDigitParser {
    public void scanAndParsInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String from = "1234567890, /*+-.";
        String to = "                 ";
        StringBuilder stringBuilder = new StringBuilder(userInput);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < from.length(); j++) {
                if (stringBuilder.charAt(i) == (from.charAt(j))) {
                    stringBuilder.setCharAt(i, to.charAt(j));
                    break;
                }
            }

        }
        System.out.println(stringBuilder.toString());
    }
}