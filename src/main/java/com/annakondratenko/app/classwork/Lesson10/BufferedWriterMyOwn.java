package com.annakondratenko.app.classwork.Lesson10;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by annak on 20.02.2017.
 */
public class BufferedWriterMyOwn {
    public void writeToFile() throws IOException {
        String firstLine = "The first line";

        String secondLine = "The second line";

        BufferedWriter writer = new BufferedWriter(

                new OutputStreamWriter(

                        new FileOutputStream("D:\\output.txt")));

        writer.append(firstLine);

        writer.newLine();

        writer.append(secondLine);

        writer.close();
    }
}
