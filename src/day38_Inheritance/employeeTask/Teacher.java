package day38_Inheritance.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, salary, "Teacher", companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is teaching math to students");
    }

}
