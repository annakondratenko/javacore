package com.annakondratenko.app.classwork.Lesson18;

import java.util.*;

/**
 * Created by annak on 16.03.2017.
 */
public class Collections {
    public void arrayListMethod() {
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words ");
        for (int i = 0; i < 5; i++) {
            String enteredWorld = scanner.next();
            myList.add(enteredWorld);
        }
        System.out.println(myList);
    }

    public void hashSetMethod() {
        System.out.println("Enter different and unique words");
        HashSet hashSet = new HashSet();
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String A = scanner1.next();
            hashSet.add(A);
        }
        System.out.println(hashSet);
        Map map = new HashMap<>();
        map.put("Cars","7");
        map.put("Cars","8");
        map.put("Brum","8");
        map.put("Carr","8");

        System.out.println(map.get("Cars"));
        System.out.println(map);
    }
}
