package com.annakondratenko.runners.homework.Lesson18;

import com.annakondratenko.app.homework.Lesson18.Categories;
import com.annakondratenko.app.homework.Lesson18.ContactsList;
import com.annakondratenko.app.homework.Lesson18.PersonInfo;

import java.util.Scanner;

/**
 * Created by annak on 19.03.2017.
 */
public class ContactsListRunner {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter category name ");

        String inpVal = scanner.next();
        Categories category1 = new Categories(inpVal);
        createCategory(category1, scanner);

        System.out.println("Enter category name ");
        inpVal = scanner.next();
        Categories category2 = new Categories(inpVal);
        createCategory(category2, scanner);





    }

    private static void createCategory (Categories category, Scanner scanner){
        String name;
        String surname;
        String phoneNumber;
        for (int i = 0; i<3; i++){
            System.out.println("Enter person name");
            name = scanner.next();
            System.out.println("Enter person surname");
            surname = scanner.next();
            System.out.println("Enter person phone number");
            phoneNumber = scanner.next();
            PersonInfo personInfo = new PersonInfo(name, surname, phoneNumber);
            category.addToMap(personInfo);
        }
    }
}
