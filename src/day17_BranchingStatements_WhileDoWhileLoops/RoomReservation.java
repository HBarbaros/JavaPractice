package day17_BranchingStatements_WhileDoWhileLoops;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String price = "";
        System.out.println("Do you want to reserve a room?");
        String answer = scan.next();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer, please re-enter:");
            answer = scan.next();
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Have a nice day");
        }
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do you want to reserve?");
            System.out.println("King Bed == 120$");
            System.out.println("Queen Bed == 100$");
            System.out.println("Single Bed == 80$");
            scan.nextLine();
            String roomType = scan.nextLine();
            while (!(roomType.equalsIgnoreCase("king bed") || roomType.equalsIgnoreCase("queen bed") ||
                    roomType.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid answer, please re-select the room");
                roomType = scan.nextLine();
            }
            if (roomType.equalsIgnoreCase("king bed")) {
                price = "120$";
            } else if (roomType.equalsIgnoreCase("queen bed")) {
                price = "100$";
            } else {
                price = "80$";
            }
            System.out.println("price = " + price);
        }
    }
}

/*5. Create a class called RoomReservation, write a program for the room
        reservation, your program asks the user wants to reserve a room.

        if user entered yes, then ask which type of room the user wants to reserve.
        if user entered no, print "have a nice day"

        (if user entered any invalid answer (other
        than yes/no) ask user to reenter until user provides a valid entry)

        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$

        the program should be able to display the room he/she reserve and total price of the room.

        (if the user selected an invalid room, ask the user to
        reselect the room until user provides a valid entry)

 */