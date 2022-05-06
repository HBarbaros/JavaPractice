package day26_CustomMethodsPractice;

import Utilities.MathUtility;

public class MathUtilityGiven {

    public static void main(String[] args) {

        // sum of two integers
        int result = MathUtility.sum(10,20);
        System.out.println("Sum of the numbers result: " + result);

        System.out.println("-----------------------------------------------------------------");

        // sum of two decimal numbers
        double result1 = MathUtility.sum(10.2, 30.4);
        System.out.println("Sum of the numbers result: " + result1);

        System.out.println("-----------------------------------------------------------------");

        // subtraction of two integers
        int result2 = MathUtility.subtraction(90,20);
        System.out.println("Subtraction of the numbers result: " + result2);

        System.out.println("-----------------------------------------------------------------");

        // subtraction of two decimal
        double result3 = MathUtility.subtraction(55.4, 88.1);
        System.out.println("Subtraction of the numbers result: " + result3);

        System.out.println("-----------------------------------------------------------------");

        // multiplication of two integers
        int result4 = MathUtility.multiplication(10, 10);
        System.out.println("Multiplication of the numbers result: " + result4);

        System.out.println("-----------------------------------------------------------------");

        // multiplication of two decimal
        double result5 = MathUtility.multiplication(19.3, 13.5);
        System.out.println("Multiplication of the numbers result: " + result5);

        System.out.println("-----------------------------------------------------------------");

        // division of two decimal
        double result6 = MathUtility.division(34.3, 2.5);
        System.out.println("Division of the numbers result: " + result6);

        System.out.println("-----------------------------------------------------------------");

        // even integer number
        boolean result7 = MathUtility.isEven(10);
        System.out.println("Number is even: " + result7);

        System.out.println("-----------------------------------------------------------------");

        // odd integer number
        boolean result8 = MathUtility.isOdd(55);
        System.out.println("Number is odd: " + result8);

        System.out.println("-----------------------------------------------------------------");

        // maximum number between two integers
        int result9 = MathUtility.max(80,33);
        System.out.println("Maximum number is: " + result9);

        System.out.println("-----------------------------------------------------------------");

        // maximum number between two decimal numbers
        double resul10 = MathUtility.max(29.3,42.4);
        System.out.println("Maximum number is: " + resul10);

        System.out.println("-----------------------------------------------------------------");

        // minimum number between two integer numbers
        int resul11 = MathUtility.min(55, 89);
        System.out.println("Minimum number is: " + resul11);

        System.out.println("-----------------------------------------------------------------");

        // minimum number between two decimal numbers
        double resul12 = MathUtility.min(55.2 , 77.5);
        System.out.println("Minimum number is: " + resul12);

        System.out.println("-----------------------------------------------------------------");

        //square of an integer
        int result13 = MathUtility.square(3);
        System.out.println("Square: " + result13);

        System.out.println("-----------------------------------------------------------------");

        //square of a double
        double result14 = MathUtility.square(5.6);
        System.out.println("Square: " + result14);

        System.out.println("-----------------------------------------------------------------");

        // cube of an integer
        int result15 = MathUtility.cube(7);
        System.out.println("Cube: " + result15);

        System.out.println("-----------------------------------------------------------------");

        // cube of a double
        double result16 = MathUtility.cube(9.5);
        System.out.println("Cube: " + result16);









    }


}