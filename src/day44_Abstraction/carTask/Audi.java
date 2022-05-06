package day44_Abstraction.carTask;

public final class Audi extends Car implements AutoPark{

    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " has auto park");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " engine started");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is driving");
    }
}
