package day16_ForLoopStringPractice;

import java.util.Scanner;

public class TwoPositiveNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two positive numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = 0;

        for (int i = 0; i < num2; i++){
            result += num1;
        }
        System.out.println("Multiplication = " + result);


    }
}
