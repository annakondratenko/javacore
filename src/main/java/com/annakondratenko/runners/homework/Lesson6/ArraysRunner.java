package com.annakondratenko.runners.homework.Lesson6;

import com.annakondratenko.app.homework.Lesson6.PrintEvenRange;
import com.annakondratenko.app.homework.Lesson6.RandomNumber;

/**
 * Created by annak on 05.02.2017.
 */
public class ArraysRunner {
    public static void main(String[] args){
        PrintEvenRange evenRangePrinting = new PrintEvenRange();
        evenRangePrinting.printEvenFromArray();
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.evenElementsAmount();
        randomNumber.maxAndMinArrayElement();
        randomNumber.twoDimensionalArray();

    }
}
