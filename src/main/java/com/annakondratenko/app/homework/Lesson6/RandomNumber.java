package com.annakondratenko.app.homework.Lesson6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by annak on 05.02.2017.
 */
public class RandomNumber {
    public void evenElementsAmount() {
        //int[] array = {1, 3, 5, 3, 6, 8, 3, 3, 4, 2, 7, 8, 9, 0, 0};

        // create empty array with length 15
        int[] array = new int[15];
        this.simpleRandomArray(0,9, array);
        // fill out array with random values
        /*for (int i=0;i<array.length;i++){
            Random rand = new Random();  // create object rand
            array[i] = rand.nextInt(9)+0; //9 is the maximum and the 0 is our minimum
        }*/

        System.out.println(" ");

        //print array's elements
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }


        //count even amount in array
        int result=0;
        for(int i=0;i<array.length;i++) {
            if (array[i] % 2 == 0) {
                result++;
            }
        }

        //Print result of counting
        System.out.println ("\n"+ "Amount of even in array is "+result);


    }
    public void maxAndMinArrayElement(){
        //int[] array = {1, 3, 5, 3, 6, 8, 3, 3, 4, 2, 7, 8, 9, 98, 999};


        // step 1 create empty array with length 15
        int[] array = new int[15];
        this.simpleRandomArray(0,999,array);

        // step 2 fill out array with random values
        /*for (int i=0;i<array.length;i++){
            // create object rand
            Random rand = new Random();
            // rewrite elements with random value
            array[i] = rand.nextInt(999);
        }*/



        // step 3 Print array elements
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        //step 4 Print Max array value
        int maxVal = 0;
        for (int i=0;i<array.length;i++){
            if (array[i] > maxVal)
            {
                maxVal = array[i];
            }
        }
        System.out.println("\n The maximum val: " + maxVal);

        //step 5 Print Min array value
        int minVal=maxVal;
        for (int i=0;i<array.length;i++) {
            if(array[i]<minVal){
                minVal=array[i];
            }
        }
        System.out.println("\n The minimum val: " + minVal);
    }
    public void twoDimensionalArray(){
/*        int[][] array ={
                {10,16,18,19,20},
                {20,23,24,27,29},
                {31,33,35,37,39},
                {52,54,55,56,59},
                {60,61,63,65,66},
                {76,78,77,78,70},
                {88,87,89,86,85},
                {90,98,97,91,99}

        };*/
        // step 1 create empty two dimensional array with length 8X5
        int[][] array = new int[8][5];
        //this.multidimensionalRandomArray(10,99,array);

        // step 0 create object rand
        Random rand = new Random();
        // step 2 go through array and randomize all values
        for(int j=0; j<array.length; j++){
            System.out.println(" ");
            for (int k=0; k<array[j].length; k++){
                array[j][k]=rand.nextInt(99)+10;
            }
        }

        // step 3 go through array and print all values
        for(int j=0; j<array.length; j++){
            System.out.println(" ");
            for (int k=0; k<array[j].length; k++){

                System.out.print(array[j][k]+" ");

            }

        }

    }
    public void simpleRandomArray(int minArrayVal, int maxArrayVal,int[] arr){
        // fill out array with random values
        for (int i=0;i<arr.length;i++){
            Random rand = new Random();  // create object rand
            // maxArrayVal is the maximum and the minArrayVal is our minimum
            arr[i] = rand.nextInt(maxArrayVal)+minArrayVal;
        }
    }

    public void multidimensionalRandomArray(int minArrayVal, int maxArrayVal, int[][] arr){
        // step 0 create object rand
        ///Random rand = new Random();

        // step 2 go through array and randomize all values
        for(int j=0; j<arr.length; j++){
            System.out.println(" ");
            for (int k=0; k<arr[j].length; k++){
                arr[j][k] = ThreadLocalRandom.current().nextInt(minArrayVal,maxArrayVal);
                ///arr[j][k]=rand.nextInt(maxArrayVal)+minArrayVal;
            }
        }
    }
}
