package day15_ForLoop;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Level";
        String result = "";

        for (int i = str.length(); i >= 0; i--){
            result += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(result);
        System.out.println(isPalindrome);






    }
}
    /*
    A palindrome is a sequence of characters that, with spaces and punctuation excluded,
     remain unchanged if you read it backwards.

8. Write a program that can check if the given String is palindrome

Ex:
input:
Level
output:
true
input:
Anna
output:
true


     */