package com.annakondratenko.app.classwork.Lesson4;

import java.util.Scanner;

/**
 * Created by annak on 29.01.2017.
 */
public class AppSelector {
    public int appSelector() {
        int digit123=0;
        while (digit123!=4){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, select a program you'd like to start. \n " +
                " Type 1 for start right-angled triangle;\n" +
                " Type 2 for starting calculate circle area; \n" +
                " Type 3 for starting what an number is bigger/smaller.");
        digit123 = scanner.nextInt();

        switch (digit123) {
            case 1:
                RightAngledTriangle.triangleCalculations();
                break;
            case 2:
                CircleArea.calculateSize();
                break;
            case 3:
                WhatIsBigger.iSBigger();
                break;
            default:
                System.out.println("Wrong input value. Choose one of proposed value.");
                break;
        }
        }
        return digit123;
    }
}
