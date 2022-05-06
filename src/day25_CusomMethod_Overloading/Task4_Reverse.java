package day25_CusomMethod_Overloading;

import Utilities.ArraysUtilityTask4_Day25;

import java.util.Arrays;

public class Task4_Reverse {

    public static void main(String[] args) {

        int[] num1 = {10,20,30,40,50};
        int[] reverse = ArraysUtilityTask4_Day25.reverse(num1);
        System.out.println(Arrays.toString(reverse));

        System.out.println("--------------------------------------------------------");

        double[] num2 = {10.3, 16.7, 29.5, 40.5, 79.8};
        double[] reverse1 = ArraysUtilityTask4_Day25.reverse(num2);
        System.out.println(Arrays.toString(reverse1));

        System.out.println("--------------------------------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E'};
        char[] reserve2 = ArraysUtilityTask4_Day25.reverse(ch);
        System.out.println(Arrays.toString(reserve2));

        System.out.println("--------------------------------------------------------");

        String[] str = {"Java", "Programming", "Language", "Python"};
        String[] reserve = ArraysUtilityTask4_Day25.reverse(str);
        System.out.println(Arrays.toString(reserve));




    }

}

/*
    Task 4:
            1. Create a method that can reverse an integer array
            2. Create a method that can reverse a double array
            3. Create a method that can reverse a char array
            4. Create a method that can reverse a String array
 */