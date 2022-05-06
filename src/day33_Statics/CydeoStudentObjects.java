package day33_Statics;

public class CydeoStudentObjects {

    public static void main(String[] args) {

    CydeoStudent student1 = new CydeoStudent("John", 26, 'M', 9505, 'B', 8, 4);
        System.out.println(student1);
        student1.printSchoolName();
        student1.printProgrammingLanguage();

        System.out.println();

    CydeoStudent student2 = new CydeoStudent("Rosa", 25, 'F', 9608, 'A', 2, 12);
        System.out.println(student2);
        student2.printSchoolName();
        student2.printProgrammingLanguage();



    }

}
