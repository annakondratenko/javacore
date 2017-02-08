package com.annakondratenko.app.classwork.Lesson4;

import java.util.Scanner;

/**
 * Created by annak on 29.01.2017.
 */
public class WhatIsBigger {
        public static void iSBigger() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please input 1st digit ");
                double digit1 = scanner.nextDouble();
                System.out.println("Please input 2nd digit");
                double digit2 = scanner.nextDouble();
                if (digit1 > digit2)
                        System.out.print("Digit1 is bigger ");
                else if (digit1 == digit2) {
                        System.out.println("Digits are equal");
                } else
                        System.out.println("Digit2 is bigger");
        }
}

