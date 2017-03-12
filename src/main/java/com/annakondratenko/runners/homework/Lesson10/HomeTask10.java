package com.annakondratenko.runners.homework.Lesson10;

import com.annakondratenko.app.classwork.Lesson10.TypeAndWriteTextToFile;
import com.annakondratenko.app.homework.Lesson10.ArrayReader;
import com.annakondratenko.app.homework.Lesson10.Reader2Writer;
import com.annakondratenko.runners.homework.Lesson14.Numbers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by annak on 22.02.2017.
 */
public class HomeTask10 {
    public static void main(String[] args) {
        HomeTask10 loopsArraysRunner = new HomeTask10();
        loopsArraysRunner.runLoopApp();
    }

    public void runLoopApp() {
        String methodNumber = "";
        while (!methodNumber.equals("EXIT")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("All available enum: " + Arrays.toString(Numbers.values()));

            System.out.println("\n" +
                    "Menu: \n" +
                    " 1 Read digits array, sort and write it to another file\n" +
                    " 2 Read text file and verify whether the word is palindrome. \nWrite result in another file.\n" +
                    " 3 Type a text and write input to file \n" +
                    " Enter EXIT  for exit");
            System.out.println("Enter a number from menu to run the program...");
            methodNumber = scanner.nextLine();
            try {
                Numbers number = Numbers.valueOf(methodNumber);
                switch (number) {
                    case ONE:
                        ArrayReader arrayReader = new ArrayReader();
                        arrayReader.toReadFileWithDigitsArray();
                        arrayReader.sortingForReadFile();
                        try {
                            arrayReader.writeSortedArrayToFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case TWO:
                        Reader2Writer reader2Writer = new Reader2Writer();
                        try {
                            reader2Writer.readInputFile();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    case THREE:
                        System.out.println("Enter a file where you want to write your text (Important: use full path(e.g. D:\\TestFiles\\input.txt)");
                        TypeAndWriteTextToFile typeAndWriteTextToFile = new TypeAndWriteTextToFile();
                        typeAndWriteTextToFile.scanInputText();
                        System.out.println("Type your text. \n \tThen type 'exit' when you are done.");
                        typeAndWriteTextToFile.writeInputToFile();
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

