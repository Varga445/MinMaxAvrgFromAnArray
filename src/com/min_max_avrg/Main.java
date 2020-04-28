package com.min_max_avrg;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {7, 8, 4, 3, 5, 9, 2,};
        int minValueOfTheArray = MinMaxAvrgOfArr.minValue(numbers);
        int maxValueOfTheArray = MinMaxAvrgOfArr.maxValue(numbers);
        System.out.println("The min value");
        System.out.println(minValueOfTheArray);
        System.out.println("The max value");
        System.out.println(maxValueOfTheArray);
        System.out.println("The average ");
        System.out.println(MinMaxAvrgOfArr.average(numbers));

    }
}
