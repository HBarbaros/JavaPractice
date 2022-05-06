package day27_WrapperClasses;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arr = insert(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------------");

        double[] arr1 = {1.5,2.4,3.3,4.1,5.7};
        arr1 = insert(arr1, 2, 30.5);
        System.out.println(Arrays.toString(arr1));

    }


    public static int[] insert(int[] array, int index, int element){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    public static double[] insert(double[] array, int index, double element){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    public static char[] insert(char[] array, int index, char element){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    public static String[] insert(String[] array, int index, String element){

        if (index < 0 || index > array.length-1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

}

/*

1. Insert Task:

1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element.
The method inserts the given element to the given index of the array and returns the new array

                Ex:
                        arr = {10, 20, 30, 40, 50};
                        insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}

1.2 Create the same function for double array, char array and string array
 */