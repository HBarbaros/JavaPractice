package day23_CustomMethods_Void;

public class ConvertDollarToEuro {

    public static void main(String[] args) {

        convertDollarToEuro(15);

    }

    public static void convertDollarToEuro(double dollar){

        double euro = 0.92;

        double covert = dollar * euro;

        System.out.println(dollar + " dollar equals to " + covert + " euro");

    }

}

/*
9. create a method that can convert dollar to euro
 */