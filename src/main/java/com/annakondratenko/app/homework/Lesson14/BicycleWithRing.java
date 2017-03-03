package com.annakondratenko.app.homework.Lesson14;

/**
 * Created by annak on 03.03.2017.
 */
public class BicycleWithRing extends CustomBicycle implements BicycleWithRingInterface {
    public void ring() {
        String voiceOfBicycleRing = "Di-ling!";
        System.out.println(voiceOfBicycleRing);
    }
}
