package day33_Statics;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", "RS6", "Black", 2022, 100000);
        System.out.println(car1);

        System.out.println(car1.make + " has " +car1.numberOfWheels + " wheels");
        System.out.println(car1.make + " has battery : " + car1.hasBattery);
        System.out.println(car1.make + " has seats : " + car1.hasSeats);

        car1.drive();





    }

}
