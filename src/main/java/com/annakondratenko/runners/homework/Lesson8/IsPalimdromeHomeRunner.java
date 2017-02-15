package com.annakondratenko.runners.homework.Lesson8;

import com.annakondratenko.app.homework.Lesson8.IsPalindromeHome;

import java.util.Scanner;

/**
 * Created by annak on 15.02.2017.
 */
public class IsPalimdromeHomeRunner {
    public void selectMe () {
        System.out.println("Please, type a word and press Enter in order to verify whether it's a palindrome...");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        IsPalindromeHome isPalindromeHome = new IsPalindromeHome();
        isPalindromeHome.IsPalindromeHome(temp);
        isPalindromeHome.IsPalindromeHome2(temp);
        isPalindromeHome.IsPalindromeHome3(temp);
    }
}
