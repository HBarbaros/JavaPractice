package day24_CustumMethods_Return;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverse("Java"));

    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;


    }


}

/*
3. create a method named reverse that passes one string parameter,
the method can return the reversed string

Ex:
str = "Java";
reverse(str) ==> avaJ
 */