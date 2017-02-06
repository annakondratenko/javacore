package com.annakondratenko.app.classwork.Lesson6;

import com.annakondratenko.app.classwork.Lesson4.EvenOdd;

/**
 * Created by annak on 02.02.2017.
 */
public class HowManyEven {
    public void countEven (int val){
        int result=0;
        while (val > 0) {
            //System.out.println (val);
            if (val%2==0){
                result++;
            }
            val--;
        }
        System.out.println (result);


    }

   /* boolean [] BooleanArray = new boolean;
        boolean[] booleanArray = {true,true,true};

        for(boolean i=true; i<booleanArray.length; i++){

            System.out.println(booleanArray[i]);

        }*/
}
