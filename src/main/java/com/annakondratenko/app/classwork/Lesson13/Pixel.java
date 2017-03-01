package com.annakondratenko.app.classwork.Lesson13;

/**
 * Created by annak on 27.02.2017.
 */
public class Pixel {
    private int x;
    private int y;
    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getCoordinates() {
        return new int[]{x, y};
    }

}
