package day25_CusomMethod_Overloading;

import Utilities.ArrayUtilityTask2_Day25;

public class Task2_ReturnMax {

    public static void main(String[] args) {

        int[] max = {10, 20, 30, 40, 50};
        int array = ArrayUtilityTask2_Day25.max(max);
        System.out.println("array = " + array);

        System.out.println("----------------------------------------------------------");

        double[] max1 = {5.5, 6.5, 6.7, 9.6, 10.4, 11.4,};
        double array1 = ArrayUtilityTask2_Day25.max(max1);
        System.out.println("array1 = " + array1);

        System.out.println("----------------------------------------------------------");

        long[] max2 = {20,40,29,50,10,};
        long array3 = ArrayUtilityTask2_Day25.max(max2);
        System.out.println("array3 = " + array3);

        System.out.println("----------------------------------------------------------");

        short[] max3 = {38, 29, 10, 40, 90};
        short array4 = ArrayUtilityTask2_Day25.max(max3);
        System.out.println("array4 = " + array4);

        System.out.println("----------------------------------------------------------");

        float[] max4 = {38, 95, -2, 47, 55};
        float array5 = ArrayUtilityTask2_Day25.max(max4);
        System.out.println("array5 = " + array5);

        System.out.println("----------------------------------------------------------");

        byte[] max5 = {1,2,3,4,-3,0};
        byte array6 = ArrayUtilityTask2_Day25.max(max5);
        System.out.println("array6 = " + array6);


    }

}

/*Task 2:
        1. create a method that can return the max number from an integer
        array
        2. create a method that can return the max number from double array
        3. create a method that can return the max number from long array
        4. create a method that can return the max number from short array
        5. create a method that can return the max number from float array
        6. create a method that can return the max number from byte array

 */