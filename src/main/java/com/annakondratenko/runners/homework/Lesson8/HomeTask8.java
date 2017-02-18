package com.annakondratenko.runners.homework.Lesson8;

import com.annakondratenko.app.homework.Lesson8.IsPalindromeEven;

import java.util.Scanner;

/**
 * Created by annak on 15.02.2017.
 */
public class HomeTask8 {
    public static void main(String[] args) {
        System.out.println("This program check whether entered word is a palindrome.\n " +
                " Please, select one of algorithms firstly (just type a number of algorithm in order to run it):\n" +
                "\t1. Algorithm 1\n" +
                "\t2. Algorithm 2\n" +
                "\t3. Algorithm 3\n" +
                "\t4. Algorithm 4\n" +
                "\tPress * for exit");
        IsPalindromeEven isPalindromeHome = new IsPalindromeEven();
        Scanner scanner = new Scanner(System.in);
        String alNum = scanner.nextLine();
        while(!alNum.equals("*")) {
            switch (alNum) {
                case "1":
                    System.out.println("Please, type a word and press Enter");
                    isPalindromeHome.IsPalindromeStandard(alNum);
                    break;
                case "2":
                    System.out.println("Please, type a word and press Enter");
                    isPalindromeHome.IsPalindromeFoundInWeb(alNum);
                    break;
                case "3":
                    System.out.println("Please, type a word and press Enter");
                    isPalindromeHome.IsPalindromeEvenFoundInWeb(alNum);
                    break;
                case "4":
                    System.out.println("Please, type a word and press Enter");
                    isPalindromeHome.iSPalindromeWithReverse(alNum);
                    break;
                default:
                    System.out.println("Wrong input value. Exit.");
                    break;
            }
            break;
        }
    }
}

