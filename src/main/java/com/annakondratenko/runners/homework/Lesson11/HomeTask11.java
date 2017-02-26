package com.annakondratenko.runners.homework.Lesson11;
import com.annakondratenko.app.homework.Lesson11.Human;
import com.annakondratenko.app.homework.Lesson11.WhiteCollar;
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
        while (!methodNumber.equals("*")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" +
                    "Menu: \n" +
                    " 1 Run Human class\n" +
                    " 2 Run WhiteCollar class\n" +
                    " Press * for exit");
            System.out.println("Enter a number from menu to run the program...");
            methodNumber = scanner.nextLine();
            switch (methodNumber) {
                case "1":
                    Human human = new Human("Bibik", 0);
                    human.setAge(30);
                    System.out.println("name " + human.getName());
                    System.out.println("age "+human.getAge());

                    break;
                case "2":
                    WhiteCollar whiteCollar = new WhiteCollar("Anita",0,"Kindergaten");
                    whiteCollar.setCompany("Offi22ce");
                    break;

                case "*":
                    System.out.println("\nYou are successfully left an app.\n");
                    break;
                default:
                    System.out.println("Wrong input value. Choose one of proposed values.\n");
                    break;

            }
        }
    }
}
