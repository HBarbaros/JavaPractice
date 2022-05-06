package day19_Recap_LoopsString;

import java.util.Scanner;

public class StringShortQuiz {

    public static void main(String[] args) {



        /*String str = " ";
        str.trim();
        boolean A = str.isEmpty();
        System.out.println(A);

         /*

         */
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta + tb;
        ta.replace('C', 'D');
        System.out.println(ta);


       /* String str = "Hello World";
        str.trim();
        int z = str.indexOf(" ");
        System.out.println(z);

        */



        String str = "Batch 21";
        int Z = str.trim().length();
        System.out.println(Z);


        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1==s2is: " + s1==s2);



    }

}
