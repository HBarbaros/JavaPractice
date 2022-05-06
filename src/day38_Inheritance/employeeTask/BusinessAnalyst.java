package day38_Inheritance.employeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, salary, "Business Analyst", companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is business analyst");
    }

}
