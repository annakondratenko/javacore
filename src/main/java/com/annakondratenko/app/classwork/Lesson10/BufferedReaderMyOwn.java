package com.annakondratenko.app.classwork.Lesson10;

import com.annakondratenko.app.homework.Lesson8.IsPalindromeEven;

import java.io.*;

/**
 * Created by annak on 20.02.2017.
 */
public class BufferedReaderMyOwn {
    private String line;

    public void readInpuTXTFile() throws FileNotFoundException {
        boolean isPalindrome;

        try {
            IsPalindromeEven isPalindromeEven = new IsPalindromeEven();
            BufferedReader reader = new BufferedReader(
                    new FileReader("D:\\TestFiles\\input.txt")
            );

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("D:\\TestFiles\\output.txt")));
            while ((line = reader.readLine()) != null) {
                isPalindrome = isPalindromeEven.IsPalindromeStandard(line);
                if (isPalindrome) {
                    try {
                        writer.append(line);
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        writer.append(line);
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

