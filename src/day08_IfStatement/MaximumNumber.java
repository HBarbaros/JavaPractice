package day08_IfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

       int nr1 = 200;
       int nr2 = 100;

       if(nr1 == nr2){
           System.out.println(nr1 + " and " + nr2 + " are equal number");
       }
       if(nr1 > nr2){
           System.out.println(nr1 + " is maximum number");
       }
       if(nr1 < nr2){
           System.out.println(nr2 + " is maximum number");
       }

    }
}
/*
3. Write a program that can print the maximum number between two
numbers, if both are equal then print Equal
Ex:
n1= 100, n2 = 200;
output:
200 is maximum number
 */