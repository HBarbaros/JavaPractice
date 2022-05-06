package day10_NestedIf;

public class CrewAndPassangers {

    public static void main(String[] args) {

        int n = 50;
        String total = "";

        if (n == 50 || n == 75 || n == 100){

            if (n == 50){
                total = "crew 20, passengers 30";
            }else if (n == 75){
                total = "crew 25, passengers 50";
            }else{
                total = "crew 30, passengers 70";

            }

        }else{
            total = "Invalid Number";
        }
        System.out.println(total);


    }
}
 /*
 2. Create a class called CrewAndPassangers, Given a number of people on
the ship (int number), determine how many need to be crew members and
how many can be passengers. Print how many of each type there should
be.
Total: 50  ====> 20 crew, 30 passengers
Total: 75  ====> 25 crew, 50 passengers
Total: 100 ====> 30 crew, 70 passengers
Any other number of people on the ship is not valid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
  */