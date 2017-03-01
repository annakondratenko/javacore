package com.annakondratenko.runners.classwork.Lesson13;

import com.annakondratenko.app.classwork.Lesson13.Line;
import com.annakondratenko.app.classwork.Lesson13.Pixel;

import java.util.Arrays;

/**
 * Created by annak on 27.02.2017.
 */
public class LineRunner {

    public static void main(String[] args) {
        Pixel pixel1 =  new Pixel(10, 14);
        Pixel pixel2 =  new Pixel(14, 18);
        Pixel pixel3 =  new Pixel(18, 20);
        Line line = new Line(10, 20);
        line.addPixel(pixel1);
        line.addPixel(pixel2);
        line.addPixel(pixel3);
        System.out.println(Arrays.toString(line.getCoordinates()));
    }
}
