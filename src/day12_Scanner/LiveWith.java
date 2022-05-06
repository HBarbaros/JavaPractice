package day12_Scanner;

import java.util.Scanner;

public class LiveWith {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int number = scan.nextInt();
        String liveWith = "";

        liveWith = (number >= 0 && number <=3)? "Live with less than 3 people" :(number >= 3 && number <= 6)? "Live with 3 - 6 people" : "live with more than 6 people";

        System.out.println(liveWith);

        scan.close();

    }

}
/*
1. Ask the user how many people they live with:
if user lives with Less than 3 people: print "Live with less
than 3 people"
if the user lives with 3 - 6 people: print "Live with 3 - 6
people"
if the user lives with more than 6 people: print "Live with
"more than 6 people"
 */