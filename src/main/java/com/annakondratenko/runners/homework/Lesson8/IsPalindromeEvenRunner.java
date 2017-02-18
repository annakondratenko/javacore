package com.annakondratenko.runners.homework.Lesson8;

import com.annakondratenko.app.homework.Lesson8.IsPalindromeEven;

import java.util.Scanner;

/**
 * Created by annak on 15.02.2017.
 */
public class IsPalindromeEvenRunner {
    public static void main(String[] args) {
            System.out.println("Please, type a word and press Enter in order to verify whether it's a palindrome...");
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            IsPalindromeEven isPalindromeHome = new IsPalindromeEven();
            isPalindromeHome.IsPalindromeStandard(temp);
            isPalindromeHome.IsPalindromeFoundInWeb(temp);
            isPalindromeHome.IsPalindromeEvenFoundInWeb(temp);
            isPalindromeHome.iSPalindromeWithReverse(temp);
    }
}
