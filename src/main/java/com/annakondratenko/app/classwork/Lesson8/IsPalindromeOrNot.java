package com.annakondratenko.app.classwork.Lesson8;

/**
 * Created by annak on 15.02.2017.
 */
public class IsPalindromeOrNot {
    public boolean isTextPalindromeOrNot(String val) {
        boolean isPalindrome = true;

        for (int i = 0; i < val.length() / 2; i++) {
            isPalindrome = isPalindrome && (val.charAt(i) == val.charAt(val.length() - i - 1));
        }

        if (isPalindrome)
            System.out.println("Palindrome");

        else
            System.out.println("Not palindrome");
        return isPalindrome;
    }

}
