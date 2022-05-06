package day44_Abstraction.carTask;

public final class Tesla extends Car implements AutoPark, AutoPilot{

    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
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
        System.out.println(getMake() + " " + getModel() + " has auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " " + getModel() + " is driving by self");
    }
}
