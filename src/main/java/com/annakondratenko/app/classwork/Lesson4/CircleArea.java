package com.annakondratenko.app.classwork.Lesson4;

import java.util.Scanner;

/**
 * Created by annak on 26.01.2017.
 */
public class CircleArea {
    public static final double PI = 3.14d;

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Type radius and press enter");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI*radius*radius;
        System.out.println("Area is " + circleArea);
    }

    public static void calculateBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius");
        double radius1 = scanner.nextDouble();
        double area1 = PI+ Math.pow(radius1,2);
        System.out.println("Please input radius2");
        double radius2 = scanner.nextDouble();
        double area2 = PI*Math.pow(radius2,2);
        if (area1>area2)
            System.out.print("Area1 is bigger ");
        else if (area1==area2) {
            System.out.println ("Area2 equal to Area1");
        } else
            System.out.println ("Area2 is bigger");
    }

    public static void calculateSize () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input radius");
        double r1 = scanner.nextDouble();
        double area1 = PI + Math.pow(r1, 2);
        System.out.println("Please input 2nd radius");
        double r2 = scanner.nextDouble();
        double area2 = PI * Math.pow(r2, 2);
        if ((r1 > r2) || (area1 > area2)) {

            System.out.print("Area1 is bigger. ");

            System.out.print("Area2 is smaller. ");

        } else {

            System.out.print("Area2 is bigger. ");

            System.out.print("Area1 is smaller. ");
        }
    }
   /* public static double scannerDoubleVar (double doubleVar){
        Scanner scanner = new Scanner(System.in);
        double returnVal = scanner.nextDouble();
        return returnVal;
    }*/
}
