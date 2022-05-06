package day13_StringClass;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String str = input.next();

        int totalChar = str.length();

        System.out.println("Enter a word");
        String str1 = input.next();

        int totalChar1 = str1.length();

        System.out.println("Enter a word");
        String str2 = input.next();

        int totalChar2 = str2.length();

        if (totalChar == totalChar1 && totalChar1 == totalChar2){
            System.out.println("All words are same length");
        }else if (totalChar == totalChar1 || totalChar == totalChar2 || totalChar1 == totalChar2){
            System.out.println("Not same nor different lengths");
        }else{
            System.out.println("All different length");
        }

        input.close();



    }


}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"

 */