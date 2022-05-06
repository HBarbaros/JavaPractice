package day11_Switch;

public class Elevator {

    public static void main(String[] args) {

        //solution 1

        int floorNumber = 5;
        String companies = "";
        String result = "";


        if (floorNumber == 1 || floorNumber == 2 || floorNumber == 3){

            if (floorNumber == 1){
                result = "Floor 1 selected.";
                companies = " Companies: Lobby, Verizon, Starbucks";
            }else if (floorNumber == 2){
                result = "Floor 2 selected.";
                companies = " Companies: Cybertek, NASA, Intelsat";
            }else{
                result = "Floor 3 selected.";
                companies = " Companies: Lyft, BofA, Steak House";
            }

        }else{
            result = "Invalid floor - 6";
        }

        System.out.println(result + companies);

        System.out.println("--------------------------------------------------------------------");

        // solution 2

        switch (floorNumber){

            case 1:
                result = "Floor 1 selected.";
                companies = " Companies: Lobby, Verizon, Starbucks";
                break;

            case 2:
                result = "Floor 2 selected.";
                companies = " Companies: Cybertek, NASA, Intelsat";
                break;

            case 3:
                result = "Floor 3 selected.";
                companies = " Companies: Lyft, BofA, Steak House";
                break;

            default:
                result = "Invalid floor - 6";


        }
        System.out.println(result + companies);

        System.out.println("--------------------------------------------------------------------");

        // solution 3

        if (floorNumber == 1 || floorNumber == 2 || floorNumber == 3){

            switch (floorNumber){

                case 1:
                    result = "Floor 1 selected.";
                    companies = " Companies: Lobby, Verizon, Starbucks";
                    break;

                case 2:
                    result = "Floor 2 selected.";
                    companies = " Companies: Cybertek, NASA, Intelsat";
                    break;

                default:
                    result = "Floor 3 selected.";
                    companies = " Companies: Lyft, BofA, Steak House";
                    break;


            }

        }else{
            result = "Invalid floor - 6";
        }

        System.out.println(result + companies);

    }

}
/*
2. Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1
selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2
selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3
selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */
