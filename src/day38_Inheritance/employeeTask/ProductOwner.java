package day38_Inheritance.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, salary, "Product Owner", companyName);
    }

    @Override
    public void work() {
        System.out.println(name + " is product owner");
    }

}
