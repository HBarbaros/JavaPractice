package day17_BranchingStatements_WhileDoWhileLoops;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();

        System.out.println("Enter your gender: (male/female)");
        String gender = scan.next().toLowerCase();

        while (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("Enter your gender: male/female");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Are you married? (Yes/No)");
        String married = scan.next().toLowerCase();

        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no"))){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("Are you married? (Yes/No)");
            married = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        while(!(age >= 1 && age <= 120)){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("Enter your age:");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drives in a day?");
        double miles = scan.nextDouble();

        while(!(miles >= 5)){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("How many miles do you drives in a day?");
            miles = scan.nextDouble();
        }

        System.out.println("Do you want full coverage or liability insurance?");
        String insuranceType = scan.next().toLowerCase();

        while (!(insuranceType.equalsIgnoreCase("coverage") || insuranceType.equalsIgnoreCase("liability"))){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("Do you want full coverage or liability insurance?");
            insuranceType = scan.next().toLowerCase();
        }

        System.out.println("Did you have any accidents or claims in past 5 years? (Yes/No)");
        String accident = scan.next().toLowerCase();

        while (!(accident.equalsIgnoreCase("yes") || accident.equalsIgnoreCase("no"))){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("Did you have any accidents or claims in past 5 years? (Yes/No)");
            accident = scan.next().toLowerCase();
        }

        System.out.println("Does your car an anti-theft device? (Yes/No)");
        String antiTheftDevice = scan.next().toLowerCase();

        while( !(antiTheftDevice.equalsIgnoreCase("yes") || antiTheftDevice.equalsIgnoreCase("no"))){
            System.err.println("Invalid Enter, Please Re-Enter!");
            System.out.println("Has your car an anti-theft device?yes/no");
            antiTheftDevice = scan.next().toLowerCase();
        }

        // Insurance Quote calculation:

        double price = 0;

        if (insuranceType.equals("liability")){
            if (age < 25){
                price += 90;
            }else{
                price += 50;
            }

            if (miles > 50){
                price += 50;
            }else if (miles > 10){
                price += 30;
            }else{
                price += 10;
            }
        }else {

            // starting prices for full coverage:

            if (age < 25) {
                price += 160;
            } else {
                price += 120;
            }
            if (miles > 50) {
                price += 70;
            } else if (miles > 10) {
                price += 40;
            } else {
                price += 20;
            }
        }

        //discountRate calculation:

        double discountRate = 0;

        if (antiTheftDevice.equals("yes")){
                discountRate += 0.05;
        }
        if (accident.equals("yes")){
                discountRate -= 0.15;
        }else{
                discountRate += 0.1;
        }
        if (married.equals("yes")){
                discountRate += 0.05;
        }

        double totalPrice = price * (1 - discountRate);

        System.out.println("Name = " + name);
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Married = " + married);
        System.out.println("Has Anti-Theft Device = " + antiTheftDevice);
        System.out.println("Had Accident or Claims = " + accident);
        System.out.println("insurance Type = " + insuranceType);
        System.out.println("Your insurance price is = " + totalPrice);


        scan.close();

    }
}

/*

6. Create a class called InsuranceQuote, write a program that can
calculate the insurance cost of a person based on the following info:

1. Ask the user to enter your name
2. Ask the user to enter your gender
(if user enters invalid entry, ask the user
to re-enter until user provides a valid entry)

3. Ask the user if he/she is married(Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)

4. Ask user to enter your age
(age can not be negative or
greater than 120)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)

5. Ask user to enter how many miles he/she
drives in a day
(mileage can not be negative or less than 5)
(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

6. Ask the user if he/she wants full coverage
or liability insurance?

7. Ask if he/she had any accidents or claims
in past 5 years (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)

8. Ask the user if his/her car has an anti-theft device (Yes/No)
(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

Calculate the price of the insurance and display all the info of the user

Insurance Quote calculation:
starting prices for liability:
        age < 25 ===> 90
        age >= 25 ==> 50
        miles <= 10 ====> $10
        miles > 10 and miles <= 50 ==> $30
        miles > 50 ===>  $50

starting prices for full coverage:
        age < 25 ===> 160
        age >= 25 ==> 120
        miles <= 10 ====> $20
        miles > 10 and miles <= 50 ==> $40
        miles > 50 ===>  $70

    If the car has anti-theft device ==> 5% discount
    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
    If he/she never had any accidents or claims in past 5 years ==> 10% discount
    If he/she is married ==> 5% discount
 */