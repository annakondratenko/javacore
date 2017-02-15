package com.annakondratenko.runners.classwork.Lesson8;

import com.annakondratenko.app.classwork.Lesson8.ConvertPrimitiveToString;
import com.annakondratenko.app.classwork.Lesson8.ConvertStringToDouble;
import com.annakondratenko.app.classwork.Lesson8.ConvertStringToInt;

/**
 * Created by annak on 13.02.2017.
 */
public class ConvertPrimitiveToStringAndBackRunner {
    public static void main(String[] args) {
        double doubleVal = 1000.0002;
        int intVal = 1;
        long longVal = 4L;
        boolean booleanVal = true;
        String toInt = "23";
        String toDouble = "23.5";


        ConvertPrimitiveToString convertPrimitiveToString = new ConvertPrimitiveToString();
        convertPrimitiveToString.convertPrimitiveDoubleToString(doubleVal);
        convertPrimitiveToString.convertPrimitiveIntToString(intVal);
        convertPrimitiveToString.convertPrimitiveBooleanToString(booleanVal);
        convertPrimitiveToString.convertPrimitiveLongToString(longVal);

        ConvertStringToInt convertStringToInt = new ConvertStringToInt();
        convertStringToInt.convertStringToInt(toInt);

        ConvertStringToDouble convertStringToDouble = new ConvertStringToDouble();
        convertStringToDouble.convertStringToDouble(toDouble);
    }
}
