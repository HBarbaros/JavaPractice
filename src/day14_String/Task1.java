package day14_String;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words please:");
        String word = scan.next();
        String word1 = scan.next();

        word = word.substring(1);
        word1 = word1.substring(1);

        System.out.println(word + word1);

        scan.close();


    }

}
/*
1. Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */