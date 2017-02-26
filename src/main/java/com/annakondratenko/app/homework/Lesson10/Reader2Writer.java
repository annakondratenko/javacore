package com.annakondratenko.app.homework.Lesson10;

import com.annakondratenko.app.homework.Lesson8.IsPalindromeEven;

import java.io.*;

/**
 * Created by annak on 22.02.2017.
 */
public class Reader2Writer {
    private String line;

    public void readInputFile() throws FileNotFoundException {
        boolean isPalindrome;
        String pathToFileReader = "D:\\TestFiles\\palindromeTextOrNot.txt";
        String pathToFileWriter = "D:\\TestFiles\\output.txt";
        try {
            IsPalindromeEven isPalindromeEven = new IsPalindromeEven();
            BufferedReader reader = new BufferedReader(
                    new FileReader(pathToFileReader)
            );

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(pathToFileWriter)));
            while ((line = reader.readLine()) != null) {
                isPalindrome = isPalindromeEven.IsPalindromeStandard(line);
                if (isPalindrome) {
                    try {
                        writer.append(line).append(" is a palindrome");
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        writer.append(new StringBuilder().append(line).append(" is not a palindrome").toString());
                        writer.newLine();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            reader.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            System.out.println("Regardless about exception you will see this text");

        }
    }
}
