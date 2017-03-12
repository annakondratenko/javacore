package com.annakondratenko.app.homework.Lesson16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by annak on 12.03.2017.
 */
public class WhichAge {
    private String userGuess;
    public void guessAge() {
        List<FamousPeople> somethingList = Arrays.asList(FamousPeople.values());
        Collections.shuffle(somethingList);
        for (FamousPeople person : somethingList) {
            System.out.println(person);
            System.out.println("Guess his/her age?");
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextLine();
            String toExit = "EXIT";
            if (userGuess.equals(toExit)){
                return;
            }
            if (userGuess.equals(person.age)){
                System.out.println("Congratulations!");
            }else{
                System.out.println("Wrong :(");
            }
        }
    }
}
