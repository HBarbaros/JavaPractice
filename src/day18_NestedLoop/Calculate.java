package day18_NestedLoop;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your first number:");
            int num = scan.nextInt();

            System.out.println("Enter a math operator:");
            char ch = scan.next().charAt(0);

            while (!(ch == '/' || ch == '*' || ch == '-' || ch == '+')){
                System.out.println("Invalid Entry, Please Re-Enter!");
                System.out.println("Enter a math operator:");
                ch = scan.next().charAt(0);
            }

            System.out.println("Enter your second number:");
            int num2 = scan.nextInt();

            double result = 0;

            if (ch == '/'){
                result = num / num2;
            }else if (ch == '*'){
                result = num * num2;
            }else if (ch == '-'){
                result = num - num2;
            }else {
                result = num + num2;
            }
            System.out.println(result);
            scan.nextLine();

            System.out.println("Do you want to continue?");
            String answer = scan.nextLine().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Entry, Please Re-Enter!");
                System.out.println("Do you want to continue?");
                answer = scan.nextLine().toLowerCase();
            }
            if (answer.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }




        }
        scan.close();

    }

}

/*
3. Write a program that can calculate two numbers.

        1. Ask user to enter the first number
        2. Ask user to enter a math operator (+,-,/,*)
        (if user enters any invalid operator, repeat this step until user provides a valid operator)

        3. Ask user to enter the second number
        4. Display the result
        5. Ask user if they want to continue? (yes/no)

        if yes ==> repeat the entire steps
        if no ==> print "Thanks for using Cydeo calculator!"
        I
        f user enters any invalid entry,  ask
        the user to re-enter until user provides a valid entry
*/