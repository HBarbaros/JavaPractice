package day38_Inheritance.employeeTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, salary, "Scrum Master", companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " ");
    }
}
