package com.annakondratenko.runners.homework.Lesson14;

import com.annakondratenko.app.homework.Lesson14.Bicycle;
import com.annakondratenko.app.homework.Lesson14.BicycleWithRing;
import com.annakondratenko.app.homework.Lesson14.BicycleWithRingInterface;
import com.annakondratenko.app.homework.Lesson14.CustomBicycle;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by annak on 03.03.2017.
 */
public class HomeTask14 {
    public static void main(String[] args) {
        HomeTask14 loopsArraysRunner = new HomeTask14();
        loopsArraysRunner.runLoopApp();
    }

    public void runLoopApp() {
        String methodNumber = "";
        while (!methodNumber.equals("EXIT")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("All available enum: " + Arrays.toString(Numbers.values()));
            System.out.println("\n" +
                    "Menu: \n" +
                    " 1 Call method ring() from class BicycleWithRing object via BicycleWithRingInterface reference \n" +
                    " 2 Call setGear() method from class CustomBicycle object via class Bicycle reference \n" +
                    " 3 Call ride() method from class CustomBicycle object via class Bicycle reference \n" +
                    " 4 Call setSpeed() method from class CustomBicycle object via class Bicycle reference \n" +

                    " Enter EXIT  for exit");
            System.out.println("Enter a number from menu to run the program...");
            methodNumber = scanner.nextLine();
            try {
                Numbers number = Numbers.valueOf(methodNumber);
                switch (number) {
                    case ONE:
                        BicycleWithRingInterface bicycle = new BicycleWithRing();
                        bicycle.ring();
                        break;
                    case TWO:
                        Bicycle customBicycle = new CustomBicycle();
                        customBicycle.setGear();
                        break;
                    case THREE:
                        Bicycle customBicycle2 = new CustomBicycle();
                        customBicycle2.ride();
                        break;
                    case FOUR:
                        Bicycle customBicycle3 = new CustomBicycle();
                        customBicycle3.setSpeed();
                        break;
                    case EXIT:
                        System.out.println("\nYou are successfully left an app.\n");
                        break;
                    default:
                        System.out.println("Wrong input value. Choose one of proposed values.\n");
                        break;
                }
            } catch (IllegalArgumentException e) {

                System.out.println("Invalid input!");
            }
        }
    }
}
