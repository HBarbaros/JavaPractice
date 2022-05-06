package day25_CusomMethod_Overloading;

import Utilities.ArraysUtilityTask3_Day25;

public class Task3_ReturnMin {

    public static void main(String[] args) {

        int[] num = {10,20,30,40,50,60};
        int r1 = ArraysUtilityTask3_Day25.min(num);
        System.out.println("r1 = " + r1);

        System.out.println("-----------------------------------------------------------------------");

        double[] num1 = {10.2, 30.4, 50.5, 2.4, -2.4, 5.4};
        double r2 = ArraysUtilityTask3_Day25.min(num1);
        System.out.println("r2 = " + r2);

        System.out.println("-----------------------------------------------------------------------");

        long[] num2 = {432, 5546, 775, 3213, 21};
        long r3 = ArraysUtilityTask3_Day25.min(num2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------------------------------------");

        short[] num3 = {3,4,5,56,7,93,32,8};
        short r4 = ArraysUtilityTask3_Day25.min(num3);
        System.out.println("r4 = " + r4);

        System.out.println("-----------------------------------------------------------------------");

        float[] num4 = {11, 928, 7137, 488, 213, 13};
        float r5 = ArraysUtilityTask3_Day25.min(num4);
        System.out.println("r5 = " + r5);

        System.out.println("-----------------------------------------------------------------------");

        byte[] num5 = {6,34,56,66,43,32,22};
        byte rs6 = ArraysUtilityTask3_Day25.min(num5);
        System.out.println("rs6 = " + rs6);


    }

}

/*
Task 3:
        1. create a method that can return the min number from an integer array
        2. create a method that can return the min number from double array
        3. create a method that can return the min number from long array
        4. create a method that can return the min number from short array
        5. create a method that can return the min number from float array
        6. create a method that can return the min number from byte array
 */