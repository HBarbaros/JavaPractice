package day14_String;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word please:");
        String word = scan.next();

        char firstChar = word.charAt(0);
        String result = "";

        if (firstChar >= 0 && firstChar <= 9){
            result = "First character is digit";
        }else if (firstChar >= 'a' && firstChar <= 'z'){
            result = "First character is lowercase letter";
        }else if (firstChar >= 'A' && firstChar <= 'Z'){
            result = "First character is uppercase letter";
        }else{
            result = "First character is special character";
        }

        System.out.println(result);

        scan.close();

    }

}
/*
5. Ask user to enter a word,

        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character
        is lowercase letter"
        if the word starts with lowercase letters, print "first character
        is uppercase letter"
        if the word starts with special characters, print "first character
        is special character"
        HINT: 1. you need charAt() method

 */