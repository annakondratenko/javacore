package com.annakondratenko.app.classwork.Lesson15;


import java.util.Objects;

/**
 * Created by annak on 06.03.2017.
 */
public class AirPlane {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirPlane)) return false;

        AirPlane airPlane = (AirPlane) o;
        return Objects.equals(name, airPlane.name);
    }
}
