package com.annakondratenko.app.homework.Lesson14;

/**
 * Created by annak on 03.03.2017.
 */
public class CustomBicycle extends Bicycle {
    private int speed;
    private int gear;

    @Override
    public int setSpeed() {
        int localSpeed = 35;
        this.speed = localSpeed;
        System.out.println("Custom Bicycle speed is " + speed);
        return speed;
    }

    @Override
    public int setGear() {
        int localGear = 3;
        this.gear = localGear;
        System.out.println("Custom Bicycle gear size is " + gear);
        return gear;
    }

    @Override
    public void ride() {
        String customBicycleVoice = "Wshh!";
        System.out.println(customBicycleVoice);
    }
}
