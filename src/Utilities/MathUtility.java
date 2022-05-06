package Utilities;

public class MathUtility {

    // 2.1 Create a method that can return the sum of two integers
    public static int sum(int num1 , int num2){

        return num1 + num2;

    }

    // 2.2 Create a method that can return the sum of two decimal numbers
    public static double sum(double num1 , double num2){

        return num1 + num2;
    }

    //2.3 Create a method that can return the subtraction of two integers
    public static int subtraction(int num1 , int num2){

        return num1 - num2;

    }

    //2.4 Create a method that can return the subtraction of two decimals
    public static double subtraction(double num1 , double num2){

        return num1 - num2;

    }

    // 2.5 Create a method that can return the multiplication of two integers
    public static  int multiplication(int num1 , int num2){

        return num1 * num2;

    }

    // 2.6 Create a method that can return the multiplication of two decimals
    public static double multiplication(double num1 , double num2){

        return num1 * num2;

    }

    //2.7 Create a method that passes two double parameters and return the division result
    public static double division(double num1 , double num2){

        return num1 / num2;

    }

    // 2.8 Create a method that can check if an integer is even number
    public static boolean isEven(int number){

        return (number % 2 == 0) ? true : false;

    }

    // 2.9 Create a method that can check if an integer is odd number
    public static boolean isOdd(int number){

        return (number % 2 != 0) ? true : false;

    }

    // 2.10 Create a method that can return the maximum number between two integers
    public static int max(int num1 , int num2){

        return (num1 > num2) ? num1 : num2;

    }

    // 2.11 Create a method that can return the maximum number between two decimal numbers
    public  static double max(double num1 , double num2){

        return (num1 > num2) ? num1 : num2;

    }

    // 2.12 Create a method that can return the minimum number between two integers
    public static int min(int num1 , int num2){

        return (num1 < num2) ? num1 : num2;

    }

    // 2.13 Create a method that can return the minimum number between two decimal numbers
    public static double min(double num1 , double num2){

        return (num1 < num2)? num1 : num2;

    }

    // 2.14 Create a method that can return the square of an integer
    public static int square(int number){  // Ex: square(2) ==> 4

        return number * number;
        /*
        int i = 2;
        int square = i * i;
         */
    }

    // 2.15 Create a method that can return the square of a double
    public static double square(double number){

        return number * number;

    }

    //2.16 Create a method that can return the cube of an integer
    public static int cube(int number){

        return number * number * number;

        // cube = number * number * number;

    }

    // 2.17 Create a method that can return the cube of a double
    public static double cube(double number){

        return number * number * number;

    }






}



















