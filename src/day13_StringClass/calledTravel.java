package day13_StringClass;

import java.util.Scanner;

public class calledTravel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a valid passport? (Yes or No)");
        String yesOrNo = scan.next();

        if (yesOrNo.equals("Yes") || yesOrNo.equals("No")) {

            int ticket = 1000;

            if (yesOrNo.equals("Yes")) {
                scan.nextLine();

                System.out.println("Which country do you travel to?");
                String countryName = scan.nextLine();

                System.out.println("How many bags do you will take with you?");
                byte numberOfBags = scan.nextByte();
                int eachBag = ticket + (numberOfBags * 50);


                System.out.println("How many people do you travel with?");
                short person = scan.nextShort();
                int eachPerson = 0;
                if (person <= 3) {
                    eachPerson = ticket - (person * 100);
                } else {
                    ticket -= 300;
                }
                scan.nextLine();
                System.out.println("Enter the name of the people you will travel with in one line, separating each name with a comma:");
                String peopleYouTravelWith = scan.nextLine();

                int totalCost = (ticket + eachBag - eachPerson);

                System.out.println("Your ticket is booked to " + countryName + ". " + "We have charged extra for the "
                + numberOfBags + " bags but you are traveling with " + peopleYouTravelWith +
                        " so we are giving a discount. Your total cost is €" + totalCost + ".");


                }else {
                int renewalPassport = 200;

                System.out.println("When your passport expired?");
                int expiredPassport = scan.nextInt();
                int eachYear = expiredPassport * 75;


                scan.nextLine();

                System.out.println("Which country do you plan to travel?");
                String countryTravel = scan.nextLine();

                System.out.println("Do you have a plan for the travel next year? (Yes or No)");
                String travelNextYear = scan.next();
                if (travelNextYear.equals("Yes")){
                     renewalPassport += 100;
                }else{
                    renewalPassport -= 50;
                }

                String costAmount =(ticket + renewalPassport + eachYear + travelNextYear);

                System.out.println("Looks like your passport has been expired for " + expiredPassport
                        + ", but not worry we will get it ready for you to travel to " + countryTravel
                        + ". Your total cost has come out to €" + costAmount + ".");

            }
        }else{
            System.out.println("Invalid Word! Please Enter again!");
        }
        scan.close();
    }
}
