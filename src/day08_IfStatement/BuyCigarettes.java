package day08_IfStatement;

public class BuyCigarettes {

    public static void main(String[] args) {

        byte age = 15;
        boolean isEligibleBuyCigarette = age >= 18;


        if(isEligibleBuyCigarette){
            System.out.println("Eligible to buy cigarette");
        }
        if(!isEligibleBuyCigarette){
            System.out.println("Not eligible to buy cigarette");
        }

    }

}
/*
1. Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes
 */