package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your firs name:");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char firstChar = firstName.charAt(0);
        char secondChar = lastName.charAt(0);

        System.out.println(firstChar + "." + secondChar);

        scan.close();



    }

}
/*
4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */