package com.annakondratenko.app.classwork.Lesson4;

import java.util.Scanner;

/**
 * Created by annak on 26.01.2017.
 */
public class EvenOdd {
    public static void main(String[] args) {
        checkEvenVoid();
    }
    public static void checkEvenVoid (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a value");
        int value = (int) scanner.nextDouble();
        double newValue = value / 2;
        int newValue2 = (int) newValue;
        if (newValue2 + newValue2 == value) {
            System.out.println("Value is even");
        } else {
            System.out.println("Value is odd");
        }
    }
}
