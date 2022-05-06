package day23_CustomMethods_Void;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        eligibleToBuyAlcohol(20);

    }

    public static void eligibleToBuyAlcohol(int age){

        if (age >= 21){
            System.out.println(age + " is eligible to buy Alcohol");
        }else{
            System.out.println(age + " is not eligible to buy Alcohol");
        }

    }

}

/*
3. create a method that can check if a person is eligible to buy alcohol
 */