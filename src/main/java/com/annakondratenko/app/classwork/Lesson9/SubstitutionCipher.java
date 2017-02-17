package com.annakondratenko.app.classwork.Lesson9;

/**
 * Created by annak on 16.02.2017.
 */
public class SubstitutionCipher {
    public void subs (String password){
        System.out.print("Return Value :" );
        System.out.println(password.replace('a', 'T'));

        System.out.print("Return Value :" );
        System.out.println(password.replace('d', 'D'));
    }
    public String subst (String password){

    String from = "abcdefghijklmnopqrstuvwxyz";

    String to   = "qwertyuiopasdfghjklzxcvbnm";
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i<password.length(); i++){
        password.replace(from,to);
    }
        System.out.println();
    return stringBuilder.toString();
}

}
