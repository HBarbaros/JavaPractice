package day44_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla", 2015, 15000, "");
        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();

        System.out.println("----------------------------");

        Honda honda = new Honda("Accord", 2018, 18000, "Black");
        System.out.println(honda);
        honda.start();
        honda.drive();
        honda.stop();

        System.out.println("----------------------------");

        BMW bmw = new BMW("320i", 2014, 16000, "White");
        System.out.println(bmw);
        bmw.start();
        bmw.drive();
        bmw.stop();

        System.out.println("----------------------------");

        Audi audi = new Audi("A6", 2020, 25000, "Grey");
        System.out.println(audi);
        audi.start();
        audi.drive();
        audi.autoPark();
        audi.stop();

        System.out.println("----------------------------");

        Mercedes mercedes = new Mercedes("E 250", 2021, 50000, "Green");
        System.out.println(mercedes);
        mercedes.start();
        mercedes.drive();
        mercedes.autoPark();
        mercedes.stop();

        System.out.println("----------------------------");

        Tesla tesla = new Tesla("SModel", 2021, 45000, "White");
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.autoPark();
        tesla.stop();

        System.out.println("----------------------------");

        Nio nio = new Nio("Nio", 2022, 35000, "Black");
        System.out.println(nio);
        nio.start();
        nio.drive();
        nio.selfDrive();
        nio.autoPark();
        nio.stop();

        System.out.println("----------------------------");

        CydeoCar cydeo = new CydeoCar("Cydeo", 2023, 100000, "Blue");
        System.out.println(cydeo);
        cydeo.start();
        cydeo.drive();
        cydeo.selfDrive();
        cydeo.fly();
        cydeo.autoPark();
        cydeo.stop();



    }

}
