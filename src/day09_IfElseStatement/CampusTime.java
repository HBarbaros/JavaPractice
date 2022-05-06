package day09_IfElseStatement;

public class CampusTime {

    public static void main(String[] args) {

        int num = 24;

        if (num > 24){
            System.out.println("Invalid number");
        }
        else if ((num >= 8) && (num <= 23)){
            System.out.println("Open");
        }
        else{
            System.out.println("Closed");
        }


    }
}
