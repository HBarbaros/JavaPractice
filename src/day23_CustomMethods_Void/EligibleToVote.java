package day23_CustomMethods_Void;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(19);

    }

    public static void eligibleToVote(int age){

        if (age >= 19){
            System.out.println(age + " is eligible to vote in USA!");
        }else{
            System.out.println(age + " is not eligible to vote!");
        }

    }


}

/*
4. create a method that can check if a person is eligible to vote

    Ex:
        eligibleToVote(19, "USA");

    output:
        You are not eligible to vote!
 */