package day14_String;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word please:");
        String word = scan.next();



        if (word.substring(word.length() -2).equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

        scan.close();


    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */