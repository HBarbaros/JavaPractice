package day13_StringClass;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word 5 character long:");
        String str = input.next();
        String result = "";

        if (str.length() == 5){
            result = "" + str.charAt(4) + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        }else if (str.length() > 5){
            result = "Too long!";
        }else{
            result = "Too short!";
        }

        System.out.println(result);
        input.close();



    }
}
/*
1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */