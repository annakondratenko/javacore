package com.annakondratenko.runners.homework.Lesson8;

import com.annakondratenko.app.homework.Lesson8.IsPalindromeHome;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by annak on 15.02.2017.
 */
public class HomeTask8 {
    public static void main(String[] args) {
        System.out.println("This program check whether entered word is palindrom.\n " +
                " Please, select one of algorithms firstly (just type a number of algorithm in order to run it):\n" +
                "\t1. Algorithm 1\n" +
                "\t2. Algorithm 2\n" +
                "\t3. Algorithm 3\n" +
                "\tPress * for exit");
        Scanner scanner = new Scanner(System.in);
        String alNum = scanner.nextLine();
        if (alNum.equals("1") || alNum.equals("2") || alNum.equals("3")) {
            System.out.println("Please, type a word and press Enter");
        } else if (alNum.equals("*")) {
            System.out.println("\nYou are successfully left a program.\n");
            return;
        } else {
            System.out.println("Wrong input value. Exit");
            return;
        }

        IsPalindromeHome isPalindromeHome = new IsPalindromeHome();
        String temp = scanner.nextLine();
        switch (alNum) {
            case "1":
                isPalindromeHome.IsPalindromeHome(temp);
                break;
            case "2":
                isPalindromeHome.IsPalindromeHome2(temp);
                break;
            case "3":
                isPalindromeHome.IsPalindromeHome3(temp);
                break;
        }


    }
}

