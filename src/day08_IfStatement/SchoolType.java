package day08_IfStatement;

public class SchoolType {

    public static void main(String[] args) {

        byte number = 1;

        boolean elementarySchool = number >=1 && number <=5;
        boolean middleSchool = number <= 8 && !elementarySchool;
        boolean highSchool = number <= 12 && !elementarySchool && !middleSchool;
        boolean college = number <=16 && !elementarySchool && middleSchool && ! highSchool;
        boolean gradSchool = number <= 18 & !elementarySchool && !middleSchool && !highSchool && !college;

        if(elementarySchool){
            System.out.println("Elementary School");
        }
        if(middleSchool){
            System.out.println("Middle School");
        }
        if(highSchool){
            System.out.println("High School");
        }
        if(college){
            System.out.println("College");
        }
        if(gradSchool){
            System.out.println("Grad School");
        }

    }
}
/*
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
 */