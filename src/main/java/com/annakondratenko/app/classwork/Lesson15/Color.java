package com.annakondratenko.app.classwork.Lesson15;

import java.util.Objects;

/**
 * Created by annak on 06.03.2017.
 */
public class Color {
    public  String colorName;
    public int colorAmount;
    private String colorBox;
    public void setColorBox(String boxForColor){
    }
    public void toColor(){
        System.out.println("I'm just painting");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color)) return false;
        Color color = (Color) o;
        return colorName.equals(color.colorName) &&
                colorAmount == color.colorAmount;
    }
    @Override
    public int hashCode(){
        return Objects.hash(colorAmount, colorName, colorBox);
    }
}
