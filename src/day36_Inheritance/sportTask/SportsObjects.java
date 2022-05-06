package day36_Inheritance.sportTask;

public class SportsObjects {

    public static void main(String[] args) {

        Basketball basketball = new Basketball();
        basketball.setInfo("Lakers","Lebron James", 10, 3);
        System.out.println(basketball);

        System.out.println();

        Baseball baseball = new Baseball();
        baseball.setInfo("Los Angeles Angels","Mike Trout", 9, 4);
        System.out.println(baseball);

        System.out.println();

        Football football = new Football();
        football.setInfo("Manchester City","Kevin De Bryne", 22, 3);
        System.out.println(football);

        System.out.println();

        AmericanFootball americanFootball = new AmericanFootball();
        americanFootball.setInfo("Los Angeles Chargers","Justin Herbert", 22, 7);
        System.out.println(americanFootball);

    }

}
