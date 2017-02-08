package com.annakondratenko.app.classwork.Lesson6;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by annak on 02.02.2017.
 */
public class ArrayLoop {
    public void printArrays () {
        int[] arrInt={1,2,3,4};
        for (int i=0;i<arrInt.length;i++) {
            System.out.println(arrInt[i]);
        }

        boolean[] arrBoolean={true,true,false};
        for (int i=0; i<arrBoolean.length; i++){
            System.out.println(arrBoolean[i]);
        }

        char[] arrChar={'a','b', 'j','='};
        for (int i=0; i<arrChar.length;i++){
            System.out.println(arrChar[i]);
        }

        double[] arrDouble={1.2,5.8,8.5,6.9};
        for (int i=0;i<arrDouble.length; i++) {
            System.out.println(arrDouble[i]);
        }

        long[] arrLong={1,5,18,85};
        System.out.println(arrLong.length);
        for (int i=0; i<arrLong.length; i++) {
            System.out.println(arrLong[i]);
        }

        int[] intArray2={2,5,0,4};
        for(int arrElement : intArray2){
            System.out.println(arrElement);
        }
        System.out.println(Arrays.toString(intArray2));

        int[][] intArray = new int[2][3];
        intArray[0][0]=2;
        intArray[0][1]=3;
        intArray[0][2]=4;
        intArray[1][0]=4;
        intArray[1][1]=3;
        intArray[1][2]=2;
        System.out.println (intArray.length);

        for(int j=0; j<intArray.length; j++){

            for (int k=0; k<intArray[j].length; k++){

                System.out.println(intArray[j][k]);
            }
        }

        int[] copyTo = new int[3];
        System.arraycopy(intArray2,1,copyTo,0,2);
        System.out.println(copyTo);
    }
}
