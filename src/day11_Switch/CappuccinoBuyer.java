package day11_Switch;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        // solution 1


        String result = "";
        String size = "venti";

        if (size == "tall" || size == "grande" || size == "venti"){

            if (size == "tall"){
                result = "Price is €3.69 \n90 calories";
            }else if (size == "grande"){
                result = "Price is €3.99 \n120 calories";
            }else{
                result = "Price is €4.29 \n150 calories";
            }

        }else{
            size = "Invalid Size";
        }

        System.out.println(result);


        System.out.println("----------------------------------------------------------");

        // solution 2

        switch (size){

            case "tall":
                result = "Price is €3.69 \n90 calories";
                break;

            case "grande":
                result = "Price is €3.99 \n120 calories";
                break;

            case "venti":
                result = "Price is €4.29 \n150 calories";
                break;

            default:
                result = "Invalid Size";

        }
        System.out.println(result);

        System.out.println("---------------------------------------------------------------");


        // solution 3

        if (size == "tall" || size == "grande" || size == "venti"){

            switch (size){

                case "tall":
                    result = "Price is €3.69 \n90 calories";
                    break;

                case "grande":
                    result = "Price is €3.99 \n120 calories";
                    break;

                default:
                    result = "Price is €4.29 \n150 calories";


            }

        }else{
            result = "Invalid Size";
        }
        System.out.println(result);


    }

}

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */