package com.annakondratenko.runners.homework.Lesson11;

import com.annakondratenko.app.homework.Lesson11.Human;
import com.annakondratenko.app.homework.Lesson11.WhiteCollar;
import com.annakondratenko.runners.homework.Lesson14.Numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by annak on 26.02.2017.
 */
public class HomeTask11 {
    public static void main(String[] args) {
        HomeTask11 loopsArraysRunner = new HomeTask11();
        loopsArraysRunner.runLoopApp();
    }

    public void runLoopApp() {
        String methodNumber = "";
        while (!methodNumber.equals("EXIT")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("All available enum: " + Arrays.toString(Numbers.values()));
            System.out.println("\n" +
                    "Menu: \n" +
                    " 1 Run Human class\n" +
                    " 2 Run WhiteCollar class\n" +
                    " Enter EXIT  for exit");
            System.out.println("Enter a number from menu to run the program...");
            methodNumber = scanner.nextLine();
            try {
                Numbers number = Numbers.valueOf(methodNumber);
                switch (number) {
                    case ONE:
                        Human human = new Human("Bibik", 0);
                        human.setAge(30);
                        System.out.println("name " + human.getName());
                        System.out.println("age " + human.getAge());

                        break;
                    case TWO:
                        WhiteCollar whiteCollar = new WhiteCollar("Anita", 28, "Kindergaten");
                        whiteCollar.setCompany("SuperCompany");
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
