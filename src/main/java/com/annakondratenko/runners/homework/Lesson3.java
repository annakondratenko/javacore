package com.annakondratenko.runners.homework;

import com.annakondratenko.app.homework.Lesson3.MathFunc;

import java.util.Scanner;

/**
 * Created by annak on 26.05.2019.
 */
public class Lesson3 {
    public static void main(String[] args) {
        MathFunc mathFuncAbs = new MathFunc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digit");
        int yourNegativeDigit = scanner.nextInt();
        mathFuncAbs.absoluteValue(yourNegativeDigit);
    }
}
