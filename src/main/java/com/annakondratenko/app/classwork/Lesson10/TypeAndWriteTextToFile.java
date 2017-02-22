package com.annakondratenko.app.classwork.Lesson10;

import java.io.*;
import java.util.Scanner;

/**
 * Created by annak on 22.02.2017.
 */
public class TypeAndWriteTextToFile {
    private String fileName;
    private String textFromUser;

    public void scanInputText() {
        Scanner scanner = new Scanner(System.in);
        fileName = scanner.nextLine();
    }

    public void writeInputToFile() {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileName)))) {
            do {
                textFromUser = scanner.nextLine();
                writer.append(textFromUser);
                writer.newLine();
            } while (!textFromUser.contains("exit"));
            System.out.println("You are successfully wrote your text to " + fileName);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
