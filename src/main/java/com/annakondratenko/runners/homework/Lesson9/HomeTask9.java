package com.annakondratenko.runners.homework.Lesson9;


import com.annakondratenko.app.homework.Lesson9.AlphabetDigitParser;
import com.annakondratenko.app.homework.Lesson9.ArrayParser;
import com.annakondratenko.app.homework.Lesson9.ParserWithKeyWord;
import com.annakondratenko.runners.homework.Lesson14.Numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by annak on 19.02.2017.
 */
public class HomeTask9 {
    public static void main(String[] args) {
        HomeTask9 loopsArraysRunner = new HomeTask9();
        loopsArraysRunner.runLoopApp();
    }

    public void runLoopApp() {
        String methodNumber = "";
        while (!methodNumber.equals("EXIT")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("All available enum: " + Arrays.toString(Numbers.values()));

            System.out.println("\n" +
                    "Menu: \n" +
                    " 1 Enter digits and sort them\n" +
                    " 2 Enter text and see output\n" +
                    " 3 Type a text with keyword that will be omitted in output  \n" +
                    " Enter EXIT  for exit");
            System.out.println("Enter a number from menu to run the program...");
            methodNumber = scanner.nextLine();
            try {
                Numbers number = Numbers.valueOf(methodNumber);
                switch (number) {
                    case ONE:
                        System.out.println("\bTask A.\nEnter digits with coma delimiter in a row");
                        ArrayParser arrayParser = new ArrayParser();
                        arrayParser.scanAndPars();
                        System.out.println("Select method for sorting: " +
                                "\n1 - sort from A to Z" +
                                "\n2 - sort from Z to A");
                        Scanner scanner2 = new Scanner(System.in);
                        int userIput = scanner2.nextInt();
                        if (userIput == 1) {
                            arrayParser.sortIntArrayFromAToZ();
                        } else {
                            arrayParser.sortFromZtoA();
                        }

                        break;
                    case TWO:
                        System.out.println(" ");
                        System.out.println("\tTask B.\nEnter your text with coma delimiter or use one of the following: ., *, +, -, /. Otherwise, your text won't be recognized.");
                        AlphabetDigitParser alphabetDigitParser = new AlphabetDigitParser();
                        alphabetDigitParser.scanAndParsInput();

                        break;
                    case THREE:
                        System.out.println(" ");
                        System.out.println("\tTask C. \nEnter your text with keyword  'secret' in it." +
                                " Everywhere program face to 'secret' it's going to be omitted and text after will be shifted to next line. ");
                        ParserWithKeyWord parserWithKeyWord = new ParserWithKeyWord();
                        parserWithKeyWord.excludeKeyWordFromText();
                        break;

                    case EXIT:
                        System.out.println("\nYou are successfully left an app.\n");
                        break;
                    default:
                        System.out.println("Wrong input value. Choose one of proposed values.\n");
                        break;
                }
            } catch (IllegalArgumentException e) {

                System.out.println("Invalid input!");

            }
        }
    }
}