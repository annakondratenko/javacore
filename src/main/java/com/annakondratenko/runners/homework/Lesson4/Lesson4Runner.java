package com.annakondratenko.runners.homework.Lesson4;

import com.annakondratenko.app.classwork.Lesson4.*;

import java.util.Scanner;

/**
 * Created by annak on 29.01.2017.
 */
public class Lesson4Runner {
    public static void main (String args[]) {
        Lesson4Runner.runApp();
    }
    public static void  runApp () {
        String methodNumber = "";
        while (!methodNumber.equals("*")){
            Scanner scanner = new Scanner(System.in);
            System.out.println ("\n" +
                    "Classes-methods menu: \n" +
                    " 1 EvenOdd;\n" +
                    " 2 CircleArea.calculate; \n" +
                    " 3 CircleArea.calculateBigger; \n" +
                    " 4 CircleArea.CalculateSize; \n" +
                    " 5 AppSelector.appSelector; \n" +
                    " 6 RightAngledTriangle.TriangleCalculations; \n" +
                    " 7 WhatIsBigger.IsBigger.\n" +
                    "   Press '*' for exit.");
            System.out.println("Enter a number from menu to run the method...");
            methodNumber = scanner.nextLine();
            switch (methodNumber) {
                case "1":
                    EvenOdd.checkEvenVoid();
                    break;
                case "2":
                    CircleArea.calculate();
                    break;
                case "3":
                    CircleArea.calculateBigger();
                    break;
                case "4":
                    CircleArea.calculateSize();
                    break;
                case "5":
                    AppSelector.appSelector();
                    break;
                case "6":
                    RightAngledTriangle.triangleCalculations();
                    break;
                case "7":
                    WhatIsBigger.iSBigger();
                    break;
                case "*":
                    System.out.println("\nYou are successfully left an app.\n");
                    break;
                default:
                    System.out.println("Wrong input value. Choose one of proposed values.\n");
                    break;

            }
        }
    }

}

