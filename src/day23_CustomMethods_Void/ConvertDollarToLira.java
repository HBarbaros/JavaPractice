package day23_CustomMethods_Void;

public class ConvertDollarToLira {

    public static void main(String[] args) {

        convertDollarToLira(150);

    }

    public static void convertDollarToLira(double dollar){

        double lira = 14.77;

        double convert = dollar * lira;

        System.out.println(dollar + " dollar equals to " + convert + " lira");

    }

}

/*
10. create a method that can can convert dollar to lira
 */
