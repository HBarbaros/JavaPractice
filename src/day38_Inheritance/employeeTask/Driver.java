package day38_Inheritance.employeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, salary, "Driver", companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is driver bus");
    }

}
