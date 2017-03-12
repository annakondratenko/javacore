package com.annakondratenko.runners.homework.Lesson16;

import com.annakondratenko.app.homework.Lesson16.WhichAge;
import com.annakondratenko.runners.homework.Lesson14.Numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by annak on 12.03.2017.
 */
public class HomeTask16 {
    public static void main(String[] args) {
        HomeTask16 loopsArraysRunner = new HomeTask16();
        loopsArraysRunner.runLoopApp();
    }


    public void runLoopApp() {
        String methodNumber = "";
        while (!methodNumber.equals("EXIT")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("All available enum: " + Arrays.toString(Numbers.values()));
            System.out.println("\n" +
                    "Menu: \n" +
                    " Run the \"famous people's age\" quiz by entering \"ONE\" \n" +

                    " Enter EXIT  for exit");
            methodNumber = scanner.nextLine();
            try {
                Numbers number = Numbers.valueOf(methodNumber);
                switch (number) {
                    case ONE:
                        WhichAge whichAge = new WhichAge();
                        whichAge.guessAge();
                        break;
                    case EXIT:
                        System.out.println("\nYou are successfully left an app.\n");
                        return;
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
