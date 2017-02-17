package com.annakondratenko.runners.classwork.Lesson9;

import com.annakondratenko.app.classwork.Lesson9.SubstitutionCipher;

/**
 * Created by annak on 16.02.2017.
 */
public class SubstitutionCipherRunner {
    public static void main(String[] args) {
        String val = "password";
        SubstitutionCipher substitutionCipher = new SubstitutionCipher();
        //substitutionCipher.subs(val);
        substitutionCipher.subst(val);

    }
}
