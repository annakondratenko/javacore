package com.annakondratenko.app.homework.Lesson9;

import java.util.Scanner;

/**
 * Created by annak on 19.02.2017.
 */
public class ParserWithKeyWord {
    public void excludeKeyWordFromText() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(userInput);
        String[] clearedText = userInput.split("secret");
        for (int i = 0; i < clearedText.length; i++) {
            System.out.println(clearedText[i] + "\n");
        }
    }
}


