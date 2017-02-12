package com.annakondratenko.runners.homework.Lesson6;

import com.annakondratenko.app.homework.Lesson6.OddArray;
import com.annakondratenko.app.homework.Lesson6.PrintEvenRange;
import com.annakondratenko.app.homework.Lesson6.RandomNumber;
import java.util.Scanner;

/**
 * Created by annak on 06.02.2017.
 */
public class LoopsArraysRunner {
    public static void main (String args[]) {
        LoopsArraysRunner loopsArraysRunner = new LoopsArraysRunner();
        loopsArraysRunner.runLoopApp();
    }
        public void runLoopApp() {
            String methodNumber = "";
            while (!methodNumber.equals("*")) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n" +
                        "Menu: \n" +
                        " 1 Print Odd Digits from array\n" +
                        " 2 Print all Even From Array (horizontally then vertically) \n" +
                        " 3 Count Even Elements Amount in random array \n" +
                        " 4 Find Max And Min random Array's Elements \n" +
                        " 5 Print all elements of two-dimensional Array \n"+
                        " 6 Press * for exit");
                System.out.println("Enter a number from menu to run the program...");
                methodNumber = scanner.nextLine();
                RandomNumber randomNumber = new RandomNumber();
                switch (methodNumber) {
                    case "1":
                        OddArray.printOddDigits();
                        break;
                    case "2":
                    PrintEvenRange printEvenRange = new PrintEvenRange();
                        printEvenRange.printEvenFromArray();
                        break;
                    case "3":
                        randomNumber.evenElementsAmount();
                        break;
                    case "4":
                        randomNumber.maxAndMinArrayElement();
                        break;
                    case "5":
                        randomNumber.twoDimensionalArray();
                        break;
                    case "*":
                        System.out.println("\nYou are successfully left an app.\n");
                        break;
                    case "-1":
                        System.out.println("\nNegative values are not acceptable.\n");
                        break;
                    default:
                        System.out.println("Wrong input value. Choose one of proposed values.\n");
                        break;

                }
            }
        }

}
