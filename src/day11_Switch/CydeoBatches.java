package day11_Switch;

public class CydeoBatches {

    public static void main(String[] args) {

        // solution 1

        String batches = "US morning";

        String result = (batches == "US morning" || batches == "US evening" || batches == "EU")? (batches == "US morning")?
                "Class times are 10-5 EST. M, T, Th, F." :(batches == "US evening")? "Class times are 7-10 EST. M, T, W, Th, S, S"
                : "Class times are  10-5 EST. M, T, W, Th, F." : "Invalid Batches";

        System.out.println(result);

        System.out.println("------------------------------------------------------");

        // solution 2

        switch(batches){

            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;

            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;

            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;

            default:
                result = "Invalid Batches";

        }
        System.out.println(result);

        System.out.println("----------------------------------------------------------");

        // solution 3

        if (batches == "US morning" || batches == "US evening" || batches == "EU"){

            switch (batches){

                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;

                default:
                    result = "Class times are 10-5 EST. M, T, W, Th, F.";

            }

        }else{
            result = "Invalid Batches";
        }

        System.out.println(result);

    }

}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch
types: US morning, US evening, EU.
Depending on a batch type (String) print information about the
batch.
If batch type is US morning ==> print "Class times are
10-5 EST. M, T, Th, F."
If batch type is US evening ==> print "Class times are 7-
10 EST. M, T, W, Th, S, S"
If batch type is EU ==> print "Class times are  10-5 EST.
M, T, W, Th, F."
If batch type is invalid, print "Invalid Btach"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */