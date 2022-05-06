package day38_Inheritance.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, double salary, String jobTitle, String companyName) {
        super(name, age, gender, ID, salary, jobTitle, companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is working as Developer");
    }
}
