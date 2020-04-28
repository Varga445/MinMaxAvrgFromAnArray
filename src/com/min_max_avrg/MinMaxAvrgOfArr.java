package com.min_max_avrg;

public class MinMaxAvrgOfArr {

    public static int minValue(int[] a) {

        int theMinValue = a[0];
        for (int i = 1; i < a.length; i++) {

            if (theMinValue > a[i]) {
                theMinValue = a[i];
            }
        }

        return theMinValue;

    }


    public static int maxValue(int[] a) {
        int theMaxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (theMaxValue < a[i]) {
                theMaxValue = a[i];
            }
        }
        return theMaxValue;
    }


    public static double average(int[] a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total / a.length;
    }

}
