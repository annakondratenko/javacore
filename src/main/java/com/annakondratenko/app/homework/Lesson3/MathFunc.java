package com.annakondratenko.app.homework.Lesson3;

/**
 * Created by annak on 25.01.2017.
 */
public class MathFunc {
        public int compareGrater (int a, int b) {
            if (a>b){
                return a;
            } else {
                return b;
            }
        }
        public int addTwoInt (int a, int b) {
            return a+b;
        }
        public static int divideTwoInt (int a, int b) {
            return a/b;
        }
        public int multiplyTwoInt (int a, int b){
            return a*b;
        }
        public int deductTwoInt (int a, int b) {
            return a-b;
        }
        public boolean isEqual (int a, int b) {
            if (a == b) {
                return true;
            } else {
                return false;
            }
        }
        public boolean isEqualWithArray (int array[]) {
            if (array[0]== array[1]) {
                return true;
            } else {
                return false;
            }
        }
        public boolean biggerThanZero(int a) {
            if (a > 0) {
                return true;
            } else {
                return false;
            }

        }
        public boolean isNotEmpty(int a) {
            if (a != 0) {
                return true;
            } else {
                return false;
            }

        }
        public long addLongAndInt (long a, int b) {
            return a+b;
        }
        public float divideFloats (float a, float b) {
            return a/b;
        }
        public String AddSpaceAndEMToEnd (String a){
            String space = " !";
            return a+space;
        }
        public long deductTwoLong (long a, long b) {
            return a-b;
        }

        public int absoluteValue (int a){
            int absVal = Math.abs(a);
            return absVal;
        }

        public double roundingUp (double a){
        double integerVal = Math.ceil(a);
        return integerVal;
        }

        public int returnMaxVal (int a,int b){
        int maxVal = Math.max(a,b);
        return maxVal;
        }

        public int returnMinVal (int a,int b){
        int minVal = Math.min(a,b);
        return minVal;
    }
    public double raiseFirstInt (int a, int b){
        double raisedVal = Math.pow(a,b);
        return raisedVal;
    }
    }

