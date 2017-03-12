package com.annakondratenko.app.classwork.Lesson16;

import java.util.Arrays;

/**
 * Created by annak on 09.03.2017.
 */
public class Holidays {
    public enum Holiday{
        NEW_YEAR (1,"January", "New Year"), EASTER(25,"April", "Easter"), ANNA_BDAY(10,"December","Anna's B-day");
        int date;
        String month;
        String holiday;
        Holiday(int date, String month, String holiday) {
            this.date = date;
            this.month = month;
            this.holiday = holiday;
        }
    }
    public void getValue(){
        for (Holiday holiday: Holiday.values()){
            System.out.println(holiday.holiday.toString() +
                    " holiday is on "+holiday.month.toString()+", "+holiday.date);
        }
    }
}

