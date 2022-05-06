package day13_StringClass;

import java.util.Scanner;

public class Cybertek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s1 = "Cydeo";
        String s2 = "WoodenSpoon";

        System.out.println("Enter your username:");
        String str = input.nextLine();

        System.out.println("Enter your password:");
        String str1 = input.nextLine();

        if (s1.equals(str) && s2.equals(str1)){
            System.out.println("Logged in");
        }else{
            System.out.println("Incorrect username or password");
        }






    }

}
/*
8. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() method
 */