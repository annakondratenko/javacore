package com.annakondratenko.app.homework.Lesson5;

/**
 * Created by annak on 31.01.2017.
 */
public class MessageUtil {
    private String message;



    //Constructor
    //@param message to be printed

    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}