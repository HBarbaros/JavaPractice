package day21_ForEachLoop;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] result = new int[numbers.length];

        for (int i = numbers.length-1, j = 0; i >= 0; i--){
            result[j++] = numbers[i];
        }

        System.out.println(Arrays.toString(result));



    }

}
 // 1. Write a program that sort the array of integer in descending