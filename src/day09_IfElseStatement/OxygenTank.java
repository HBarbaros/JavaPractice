package day09_IfElseStatement;

public class OxygenTank {

    public static void main(String[] args) {

        int num = 150;
        String message = "Invalid Number";

        if ((num >= 50) && (num <=59)){
            message = "Be careful now you at at 50%";
        }
        else if ((num >= 60) && (num <= 69)){
            message = "Start to head back";
        }
        else if ((num >= 70) && (num <= 79)){
            message = "Don't go too far";
        }
        else if ((num >= 80) && (num <= 89)){
            message = "Still okay";
        }
        else if ((num >= 90) && (num <= 100)){
            message = "Your tank is full";
        }

        System.out.println(message);


    }


}
/*
4. Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at at 50%
USE ONE PRINT STATEMENT ONLY
 */