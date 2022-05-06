package day13_StringClass;

import java.util.Scanner;

public class Method {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter A String: ");
        String str = input.nextLine();
        input.close();

        if (str.isEmpty()) {
            System.out.println("String empty");
        } else if (str.length() > 3) {
            System.out.println("String size: " + str.length());
            System.out.println("String substring start: " + (str.length() - 3));
            int start = (str.length() - 3);
            System.out.println("last three characters: " + str.substring(start, str.length()));
        } else {
            System.out.println(str);
        }


    }

}
/*
5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */