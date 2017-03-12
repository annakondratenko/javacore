package com.annakondratenko.runners.classwork.Lesson15;

import com.annakondratenko.app.classwork.Lesson15.Blue;
import com.annakondratenko.app.classwork.Lesson15.Color;
import com.annakondratenko.app.classwork.Lesson15.Green;

/**
 * Created by annak on 06.03.2017.
 */
public class ColorRunner {
    public static void main(String[] args) {
        Color whichColorAmI = new Blue();
        Blue blue = new Blue();
        whichColorAmI.toColor();
        blue.toColor();
        Color coloredOrNot = new Color();
        coloredOrNot.toColor();
        Color whichColorAmI2 = new Green();
        whichColorAmI2.toColor();
        Green green = new Green();
        green.toColor();
        Color color1 = new Color();
        Color color2 = new Color();
        color1.colorName = "blue";
        color2.colorName = "blue";
        System.out.println(color1.equals(color2));
        color1.colorAmount = 3;
        color2.colorAmount = 3;
        System.out.println(color1.equals(color2));
        color1.setColorBox("jar");
        color2.setColorBox("jar");
        System.out.println(color2.equals(color1));
    }
}
