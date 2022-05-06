package day38_Inheritance.employeeTask;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public int ID;
    public double salary;
    public String jobTitle, companyName;

    public Employee(String name, int age, char gender, int ID, double salary, String jobTitle, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name + " is working as Tester");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

}
