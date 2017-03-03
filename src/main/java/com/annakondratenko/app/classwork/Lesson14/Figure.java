package com.annakondratenko.app.classwork.Lesson14;

/**
 * Created by annak on 02.03.2017.
 */
public abstract class Figure {
    private int area;

    public double getArea(){
        return area;
    }
    public abstract double getPerimeter();

    public Figure(int area) {
        this.area = area;
    }
}
