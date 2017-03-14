package com.annakondratenko.app.classwork.Lesson17;

/**
 * Created by annak on 13.03.2017.
 */
public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
