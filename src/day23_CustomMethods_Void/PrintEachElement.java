package day23_CustomMethods_Void;

public class PrintEachElement {

    public static void main(String[] args) {

        printEachElement(new int[]{1,2,3,4,5,6,7,8,9});

    }

    public static void printEachElement(int[] element){

        for (int number : element) {
            System.out.println(number);
        }

    }


}


/*
14. create a method named printEachElement that can print each element of an integer array
 */
