package com.annakondratenko.app.classwork.Lesson8;


/**
 * Created by annak on 13.02.2017.
 */
public class CharsToString {
    public String convertCharToString(char[]charArray){
        String stringToDisplay = "";
        for (int i=0; i<charArray.length; i++){
            stringToDisplay += charArray[i];
        }

        System.out.println(stringToDisplay);
        return stringToDisplay;
    }
}
