package com.annakondratenko.app.classwork.Lesson9;

/**
 * Created by annak on 16.02.2017.
 */
public class SubstitutionCipher {
    public void substituteSymbol(String password) {
        System.out.print("Return Value :");
        System.out.println(password.replace('a', 'T'));

        System.out.print("Return Value :");
        System.out.println(password.replace('d', 'D'));
    }

    public String substituteWord(String password) {

        String from = "abcdefghijklmnopqrstuvwxyz";

        String to = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder stringBuilder = new StringBuilder(password);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < from.length(); j++) {
                if (stringBuilder.charAt(i) == (from.charAt(j))) {
                    stringBuilder.setCharAt(i, to.charAt(j));
                    break;
                }
            }

        }
        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

}
