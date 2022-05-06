package day13_StringClass;

import java.util.Scanner;

public class CharacterTask3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length()-1);

        if (firstChar == lastChar){
            System.out.println("First and last characters are same");
        }else{
            System.out.println("First and last characters are not same");
        }

        scan.close();

    }

}
/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */