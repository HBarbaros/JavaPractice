package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score:");
        int number = scan.nextInt();

        scan.close();

        char grade = 0;

        if (number >= 0 && number <= 100){

            grade = (number >= 0 && number <= 59)? 'F' :(number >=60 && number <= 69)? 'D' :(number >= 70 && number <= 79)? 'C'
                    :(number >= 80 && number <= 89)? 'B' : 'A';

            System.out.println(grade);

        }else{
            System.out.println("Invalid number");
        }


    }
}
/*
2. GradeReport:
2.1 Ask the user to enter the his/her score
2.2 Print the grade of the student (A, B, C, D, F)
2.3 If user enter invalid score (negative or more than 100)
print invalid score
 */
