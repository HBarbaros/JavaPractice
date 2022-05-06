package day44_Abstraction.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turning off");
    }

    public void call(long PhoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling");
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting");
    }


}
