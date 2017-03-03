package com.annakondratenko.runners.homework.Lesson14;

import com.annakondratenko.app.homework.Lesson14.Bicycle;
import com.annakondratenko.app.homework.Lesson14.BicycleWithRing;
import com.annakondratenko.app.homework.Lesson14.BicycleWithRingInterface;
import com.annakondratenko.app.homework.Lesson14.CustomBicycle;

/**
 * Created by annak on 03.03.2017.
 */
public class Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycle = new BicycleWithRing();
        bicycle.ring();
        Bicycle customBicycle = new CustomBicycle();
        customBicycle.setGear();
        customBicycle.ride();
        customBicycle.setSpeed();
    }
}
