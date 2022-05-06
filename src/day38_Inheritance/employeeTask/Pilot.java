package day38_Inheritance.employeeTask;

public class Pilot extends Employee{

    public Pilot(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, salary, "Pilot", companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is flying airplane");
    }
}
