package com.annakondratenko.runners.classwork.Lesson17;

import com.annakondratenko.app.classwork.Lesson17.BoxPrinter;

/**
 * Created by annak on 13.03.2017.
 */
public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(10);
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter <String> value2 = new BoxPrinter<>("Hello world");
        System.out.println(value2);
        String intValue2 =  value2.getValue();
    }
}
