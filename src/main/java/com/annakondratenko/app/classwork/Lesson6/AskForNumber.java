package com.annakondratenko.app.classwork.Lesson6;

import java.util.Scanner;

/**
 * Created by annak on 02.02.2017.
 */
public class AskForNumber {
    public static void aAndBInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1st digit and press enter");
        int a = scanner.nextInt();
        System.out.println("Type 2nd digit and press enter");
        int b = scanner.nextInt();
      // int a = 20;
       //int b = 10;
        while (a>b){
            a=a-1;
            System.out.println (a+" is a " + b +" is b ");
        }
        if (a<=b) {
            System.out.println (a+" is a " + b +" is b ");
        }
    }
}
