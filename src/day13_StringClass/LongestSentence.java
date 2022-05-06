package day13_StringClass;

import java.util.Scanner;

public class LongestSentence {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s1 = scan.nextLine();

        int totalChar = s1.length();

        System.out.println("Enter one other sentence:");
        String s2 = scan.nextLine();

        int totalChar2 = s2.length();

        if (totalChar > totalChar2){
            System.out.println("Longest sentence is: " + s1);
        }else{
            System.out.println("Longest sentence is: " + s2);
        }

        scan.close();

    }

}
/*
2. write a program that asks user to enter two strings, and print out the
longest string
 */