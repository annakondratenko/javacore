package com.annakondratenko.runners.homework.Lesson7;
import com.annakondratenko.app.homework.Lesson6.RandomNumber;
import com.annakondratenko.app.homework.Lesson7.ArrayPrint;
import com.annakondratenko.app.homework.Lesson7.SelectionSort;
import com.annakondratenko.app.homework.Lesson7.Task2cCreate2DimensionalArray;
import com.annakondratenko.app.homework.Lesson7.TwoBubbleSortTypes;
import com.annakondratenko.runners.homework.Lesson6.HomeTask6;

import java.util.Scanner;

/**
 * Created by annak on 23.02.2017.
 */
public class HomeTask7 {
    public static void main(String[] args) {
        HomeTask7 loopsArraysRunner = new HomeTask7();
        loopsArraysRunner.runLoopApp();
    }


    public void runLoopApp() {
        String methodNumber = "";
        while (!methodNumber.equals("*")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" +
                    "Menu: \n" +
                    " 1 Sort random int array in range from 1 to 100\n" +
                    " 2 Print min and max two dimensional array's values in -99 to 99 range \n" +
                    " 3 Two types of sorting for random int array in range from 1 to 15 \n" +
                    "  Press * for exit");
            System.out.println("Enter a number from menu to run the program...");
            methodNumber = scanner.nextLine();
            switch (methodNumber) {
                case "1":
                    int[] array = new int[10];
                    final int minArrVal = 1;
                    final int maxArrVal = 100;
                    final String entryVal = "Entry array values: ";
                    final String outputVal = "Array sorted by \"selection sort\" : ";
                    RandomNumber randomNumber = new RandomNumber();
                    randomNumber.simpleRandomArray(minArrVal, maxArrVal, array);
                    ArrayPrint arrayPrint = new ArrayPrint();
                    arrayPrint.printArray(array, entryVal);
                    SelectionSort selectionSort = new SelectionSort();
                    selectionSort.sortFromZtoA(array);
                    arrayPrint.printArray(array, outputVal);
                    break;
                case "2":
                    int[][] array2 = new int[5][8];
                    final int minArrVal1 = -99;
                    final int maxArrVal1 = 99;
                    final String entryVal1 = "Entry array values: ";
                    RandomNumber randomNumber2 = new RandomNumber();
                    randomNumber2.multidimensionalRandomArray(minArrVal1, maxArrVal1, array2);
                    ArrayPrint arrayPrint2 = new ArrayPrint();
                    arrayPrint2.printTwoDimensionalArray(array2, entryVal1);
                    Task2cCreate2DimensionalArray task2c_create2DimensionalArray = new Task2cCreate2DimensionalArray();
                    task2c_create2DimensionalArray.maxTwoDimensionalValueFinder(array2);
                    task2c_create2DimensionalArray.minTwoDimensionalValueFinder(array2);

                    break;
                case "3":
                    int[] array1 = new int[15];
                    final int minArrayVal = 1;
                    final int maxArrayVal = 15;
                    final String src ="Entry array: ";
                    final String aTOz ="Array sorted from the smallest to the biggest: ";
                    final String zTOa ="Array sorted from the biggest to the smallest: ";
                    RandomNumber randomNumber1 = new RandomNumber();
                    randomNumber1.simpleRandomArray(minArrayVal,maxArrayVal, array1);
                    TwoBubbleSortTypes twoBubbleSortTypes = new TwoBubbleSortTypes();
                    //print1
                    ArrayPrint arrayPrint1 = new ArrayPrint();
                    arrayPrint1.printArray(array1, src);
                    //print2
                    twoBubbleSortTypes.aTOzBubbleSorting(array1);
                    arrayPrint1.printArray(array1,aTOz );

                    //print3
                    twoBubbleSortTypes.zTOaBubbleSorting(array1);
                    arrayPrint1.printArray(array1, zTOa);
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
