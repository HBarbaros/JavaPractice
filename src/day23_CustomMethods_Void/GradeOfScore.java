package day23_CustomMethods_Void;

public class GradeOfScore {

    public static void main(String[] args) {

        gradeOfScore(40);


    }

    public static void gradeOfScore(int score){

        if (score >= 0 && score <= 100)

            if (score >= 90){
            System.out.println('A');
            }else if (score >= 80){
            System.out.println('B');
            }else if (score >= 70){
            System.out.println('C');
            }else if (score >= 60){
            System.out.println('D');
            }else if (score >= 50){
            System.out.println('E');
            }else{
            System.out.println('F');
        }else{
            System.out.println("Invalid Entry!");
        }


    }


}

/*
5. create a method that can calculate the grade of the student based on the score
 */