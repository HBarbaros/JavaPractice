package day24_CustumMethods_Return;

public class Palindrome {

    public static void main(String[] args) {

        String str = "level";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){

        return Reverse.reverse(str).equalsIgnoreCase(str);

        // connect with "Reverse package" day24 //



    }




}

/*
4. By using the reverse method above to create another method named
isPalindrome  that passes a String parameter, the method returns true if
the string is palindrome, otherwise returns false

               Ex:
                    str = "Level"

                    isPalindrome(str) ===> true
 */