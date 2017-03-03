package com.annakondratenko.runners.classwork.Lesson14;

import com.annakondratenko.app.classwork.Lesson14.BMW;
import com.annakondratenko.app.classwork.Lesson14.Car;

/**
 * Created by annak on 02.03.2017.
 */
public class CarRunner {
        public static void main(String[] args) {
            Car bmw = new BMW();
            runAllDriverMethodsForCarInterface(bmw);
        }

        public static void runAllDriverMethodsForCarInterface(Car car){
            car.drive();
        }

    }
