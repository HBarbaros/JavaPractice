package day13_StringClass;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String result = "";

        System.out.println("Split or No Split (Yes or No)?");
        String split = input.nextLine().toLowerCase();

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = input.next();

        double totalTip = 0;

        switch (quality){
            case "Excellent":
                totalTip = amount * 0.25;
                break;
            case "Great":
                totalTip = amount * 0.20;
                break;
            case "Good":
                totalTip = amount * 0.15;
                break;
            case "Fair":
                totalTip = amount * 0.10;
                break;
            default:
                totalTip = amount * 0.05;
        }

        double totalToPay = amount + totalTip;
        double totalPerPerson = totalToPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;


        if (split.equals("Yes")){
            System.out.println("Number of people entered: " + numberOfPeople + "\nTotal to pay: " + totalToPay +
                    "\nTotal tip: " + totalTip + "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson);
        }else{
            System.out.println("Number of people entered: " + numberOfPeople + "\nTotal to pay: " + totalToPay +
                    "\n(Total tip: " + totalTip+ " + Amount: "+amount+")");
        }
        input.close();


    }

}
/*
2. Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method
 */