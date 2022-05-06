package day44_Abstraction.carTask;

public final class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{

    public CydeoCar( String model, int year, double price, String color) {
        super("Cydeo", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " engine started");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is driving");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " has auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " is driving by self");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
