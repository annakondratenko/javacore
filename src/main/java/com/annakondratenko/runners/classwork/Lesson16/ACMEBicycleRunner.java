package com.annakondratenko.runners.classwork.Lesson16;

import com.annakondratenko.app.classwork.Lesson16.ACMEBicycle;
import com.annakondratenko.app.classwork.Lesson16.Bicycle;

/**
 * Created by annak on 09.03.2017.
 */
public class ACMEBicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new ACMEBicycle();
        System.out.println(Bicycle.MODEL_NEW);
        bicycle.setSpeed();
       manageAllBicycle(bicycle, 7, 8);

        ACMEBicycle acmeBicycle = new ACMEBicycle ();
        acmeBicycle.changeCadance(10);
      // acmeBicycle.printStates();

    }
    public static void manageAllBicycle(Bicycle bicycle, int gear, int cadance){
        bicycle.changeCadance(cadance);
        bicycle.changeGear(gear);
    }
}
