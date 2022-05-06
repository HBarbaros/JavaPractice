package day23_CustomMethods_Void;

public class PositiveZeroNegative {

    public static void main(String[] args) {

        positiveZeroNegative(0);

    }

    public static void positiveZeroNegative(int number){

       String result = (number < 0) ?  number + " negative" : (number > 0)? number + " positive" :  number + " zero";

        System.out.println(result);

    }



}

/*
12. create a method that can if the given integer is positive, negative or zero
 */