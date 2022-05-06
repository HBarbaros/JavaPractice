package day44_Abstraction.carTask;

public final class Nio extends Car implements AutoPilot, AutoPark{

    public Nio( String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
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
}
