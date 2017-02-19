package com.annakondratenko.runners.homework.Lesson9;

import com.annakondratenko.app.homework.Lesson9.AlphabetDigitParser;
import com.annakondratenko.app.homework.Lesson9.ArrayParser;
import com.annakondratenko.app.homework.Lesson9.ParserWithKeyWord;

import java.util.Scanner;

/**
 * Created by annak on 19.02.2017.
 */
public class HomeTask9 {
    public static void main(String[] args) {
        System.out.println("\bTask A.\nEnter digits with coma delimiter in a row");
        ArrayParser arrayParser = new ArrayParser();
        arrayParser.scanAndPars();
        System.out.println("Select method for sorting: " +
                "\n1 - sort from A to Z" +
                "\n2 - sort from Z to A");
        Scanner scanner = new Scanner(System.in);
        int userIput = scanner.nextInt();
        if (userIput == 1) {
            arrayParser.sortIntArrayFromAToZ();
        } else {
            arrayParser.sortFromZtoA();
        }

        System.out.println(" ");
        System.out.println("\tTask B.\nEnter your text with coma delimiter or use one of the following: ., *, +, -, /. Otherwise, your text won't be recognized.");
        AlphabetDigitParser alphabetDigitParser = new AlphabetDigitParser();
        alphabetDigitParser.scanAndParsInput();

        System.out.println(" ");
        System.out.println("\tTask C. \nEnter your text with keyword  'secret' in it." +
                " Everywhere program face to 'secret' it's going to be omitted and text after will be shifted to next line. ");
        ParserWithKeyWord parserWithKeyWord = new ParserWithKeyWord();
        parserWithKeyWord.excludeKeyWordFromText();
    }
}
