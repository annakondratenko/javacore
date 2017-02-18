package com.annakondratenko.app.classwork.Lesson9;

/**
 * Created by annak on 16.02.2017.
 */
public class StringBuilderWrapper {
    public void measureStringBuilderPerformance() {
        long start = System.currentTimeMillis();

        String c = "start";

        String b = "finish";

        StringBuilder stringBuilder = new java.lang.StringBuilder();

        for (long i = 0; i < 10000000L; i++) {
            stringBuilder = stringBuilder.append(b);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    public void appendStringBuider() {
        String end = " new ending";
        StringBuilder builder = new StringBuilder("start of phrase+ ");

        builder = builder.append(end);

        System.out.print(builder.toString());
    }

    public void editStringBuilder(String word) {

        int one = 1;
        int three = 3;
        StringBuilder builder = new StringBuilder(word);

        builder.delete(one, three);
        System.out.println(builder);
        builder.replace(one, three, "new");
        System.out.println(builder);
        builder.insert(one, "B");
        System.out.println(builder);
        builder.setCharAt(three, '7');
        System.out.println(builder);


    }

    public void charArrayToString() {
        char[] charArrayToString = {'a', 'b', 'c', 'd'};

        StringBuilder builder = new StringBuilder();

        for (char value : charArrayToString) {

            builder.append(value);
        }
        System.out.println(builder);

    }

}
