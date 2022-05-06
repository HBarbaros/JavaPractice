package day10_NestedIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte n = 12;
        String grade = "";

        /*
        if (n >= 1 && n <=18){

            grade = (n >= 1 && n <= 5)? "Elementary School" :(n >= 6 && n <= 8)? "Middle School" :(n >= 9 && n <= 12)? "High School"
                    :(n >= 13 && n <= 16)? "College" : "Grad School";
            }else {
            grade = "Invalid Grade";
        }

            System.out.println(grade);

         */


        if (n >= 1 && n<= 18){

            if (n >= 1 && n <= 5){
                grade = "Elementary School";
            }else if (n >= 6 && n <= 8){
                grade = "Middle School";
            }else if (n >= 9 && n <= 12){
                grade = "High School";
            }else if (n >= 13 && n <= 16){
                grade = "College";
            }else{
                grade = "Grad School";
            }

        }else{
            grade = "Invalid Grade";
        }

        System.out.println(grade);




        }

    }


/*
1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.

grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School

For Any Other grade: Invalid grade level given

NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */