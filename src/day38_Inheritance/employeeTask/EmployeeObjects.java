package day38_Inheritance.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Cahit", 29, 'M', 1, 25000, "SDET", "Factory");
        tester.work();
        System.out.println(tester);

        Developer developer = new Developer("ZUhal", 28, 'F', 2, 26000, "Junior Developer", "Non-Fac");
        developer.work();
        System.out.println(developer);

        ProductOwner productOwner = new ProductOwner("Ismail", 34, 'M', 3, 27000, "Isot");
        productOwner.work();
        System.out.println(productOwner);

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Leyla", 27, 'F', 4, 25500, "VC");
        businessAnalyst.work();
        System.out.println(businessAnalyst);

        ScrumMaster scrumMaster = new ScrumMaster("John", 37, 'M', 5, 30000, "Apple");
        scrumMaster.work();
        System.out.println(scrumMaster);

        Teacher teacher = new Teacher("Elena", 26, 'F', 6, 21000, "TY");
        teacher.work();
        System.out.println(teacher);

        Driver driver = new Driver("Recep", 39, 'M', 7, 35000, "Karaambar");
        driver.work();
        System.out.println(driver);

        Pilot pilot = new Pilot("Bilal", 33, 'M', 8, 50000, "THY");
        pilot.work();
        System.out.println(pilot);



    }

}
