package com.annakondratenko.app.homework.Lesson14;

/**
 * Created by annak on 03.03.2017.
 */
public abstract class Bicycle {
    private String bicycleVoice = "Wroom!";

    public void ride() {
        System.out.println(bicycleVoice);
    }

    public abstract int setSpeed();

    public abstract int setGear();
}
