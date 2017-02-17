package com.annakondratenko.app.homework.Lesson8;


/**
 * Created by annak on 15.02.2017.
 */
public class IsPalindromeHome {
    public boolean IsPalindromeHome(String val) {
        String valDown = val.toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < valDown.length() / 2; i++) {
            isPalindrome = isPalindrome && (valDown.charAt(i) == valDown.charAt(valDown.length() - i - 1));
        }

        if (isPalindrome)
            System.out.println("The word is a Palindrome");

        else
            System.out.println("The word is not a Palindrome");
        return isPalindrome;
    }

    public void IsPalindromeHome2(String val) {
        String valUp = val.toUpperCase();
        int length = valUp.length();
        int i, begin, end, middle;

        begin = 0;
        end = length - 1;
        middle = (begin + end) / 2;

        for (i = begin; i <= middle; i++) {
            if (valUp.charAt(begin) == valUp.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (i == middle + 1) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("The word is not a Palindrome");
        }
    }

    public boolean IsPalindromeHome3(String val) {
        boolean isPalindrome;
        String reverse = new StringBuffer(val).reverse().toString();
        isPalindrome = reverse.equalsIgnoreCase(val);
        if (isPalindrome) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("The word is not a Palindrome");
        }
        return isPalindrome;
    }

    public void iSPalindromeWithReverse(String palindrome) {
        String valUp = palindrome.toUpperCase();

        StringBuilder builder = new StringBuilder(valUp);

        builder.reverse();

        if (valUp.equals(builder.toString()))

            System.out.println("Palindrome");

        else

            System.out.println("Not palindrome");
    }

}
