package day19_Recap_LoopsString;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your score:");
            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid Entry!");
                System.exit(0);
            }

            String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
            System.out.println(grade);

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid Entry!");
                System.exit(0);
            }

            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator App!");
                break;
            }
        }

        scan.close();

    }

}
