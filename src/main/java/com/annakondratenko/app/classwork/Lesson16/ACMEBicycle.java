package com.annakondratenko.app.classwork.Lesson16;

/**
 * Created by annak on 09.03.2017.
 */
public class ACMEBicycle implements Bicycle {
    int speed ;
    int cadance;
    int gear;
    @Override
    public void changeCadance(int newVal) {
        this.cadance = newVal;
        System.out.println(cadance + " is cadance");
    }

    @Override
    public void changeGear(int newVal) {
        this.gear = newVal;
        System.out.println(gear + " is gear");


    }
    public void printStates(){
        System.out.println(speed+ " is speed \n"+
         cadance +" cadance is \n"+
        " gear is "+ gear);
    }
}
