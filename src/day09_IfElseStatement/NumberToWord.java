package day09_IfElseStatement;

public class NumberToWord {

    public static void main(String[] args) {

        int n = 6;
        String word;

        if (n == 1){
            word = "One";
        }
        else if (n == 2){
            word = "Two";
        }
        else if (n == 3){
            word = "Three";
        }
        else if (n == 4){
            word = "Four";
        }
        else if (n == 5){
            word = "Five";
        }
        else if (n == 6){
            word = "Six";
        }
        else if (n == 7){
            word = "Seven";
        }
        else if (n == 8){
            word = "Eight";
        }
        else{
            word = "Nine";
        }

        System.out.println(word);


    }
}
/*
1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One
 */