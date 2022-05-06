package day23_CustomMethods_Void;

public class ConvertKgToLb {

    public static void main(String[] args) {

        convertKgToLb(15);

    }

    public static void convertKgToLb(double kg){

        double lb = 2.20;

        double convert = kg * lb;

        System.out.println(kg + " kg equals to " + convert + " lb");


    }


}

/*
11. create a method that can convert kg to lb
 */