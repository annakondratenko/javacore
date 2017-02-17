package com.annakondratenko.app.classwork.Lesson9;

/**
 * Created by annak on 16.02.2017.
 */
public class MeasureStringBuilderPerformance {
    public void buildStringFromDubstrings(){
       long start = System.currentTimeMillis();

        String c = "start";

        String b = "finish";

        int one =1;
        int three = 3;
        StringBuilder stringBuilder = new StringBuilder();

        for (long i = 0; i < 1000000L; i++)

            stringBuilder = stringBuilder.append(b);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        stringBuilder.delete(one,three);
        stringBuilder.replace(one,three,"blabla");
        stringBuilder.insert(one,"dfghj");
    }

    public void charArrayToString (){
        char[] charArrayToString = {'a','b','c','d'};

        StringBuilder builder = new StringBuilder();

        for (char value : charArrayToString){

            builder.append(value);

        }
    }

}
