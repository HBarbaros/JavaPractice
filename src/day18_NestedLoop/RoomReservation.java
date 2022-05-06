package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;

        while (true) {

            System.out.println("Which bedroom do you want to reserve?");
            System.out.println("\t\tKing Bed ==> 120$");
            System.out.println("\t\tQueen Bed ==> 100$");
            System.out.println("\t\tSingle Bed ==> 80$");
            String bed = scan.nextLine().toLowerCase();

            while (!(bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single bed"))) {
                System.err.println("Invalid Entry, Please Re-Enter!");
                System.out.println("\t\tKing Bed ==> 120$");
                System.out.println("\t\tQueen Bed ==> 100$");
                System.out.println("\t\tSingle Bed ==> 80$");
                bed = scan.nextLine().toLowerCase();
            }

            System.out.println("Have many nights do you want to stay?");
            int night = scan.nextInt();


            scan.nextLine();
            total += (bed.equals("king bed") ? 120 * night : (bed.equals("queen bed") ? 100 * night :  80 * night));

            System.out.println("Would you like to reserve another room? (yes/no)");
            String answer = scan.nextLine().toLowerCase();


            while (!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Entry, Please Re-Enter!");
                System.out.println("Would you like to reserve another room? (yes/no)");
                answer = scan.nextLine().toLowerCase();

            }
            if (answer.equals("no")){
                System.out.println("Your total price is: $" + total);
                break;
            }


        }
        scan.close();

    }

}
/*
        2.Create a class called RoomReservation, write a program for the room

        reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$

        the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
        Then Ask the user "would you like to reserve another room?""

        if yes ==> repeat the entire steps
        if no ==> return the  total price

        If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */