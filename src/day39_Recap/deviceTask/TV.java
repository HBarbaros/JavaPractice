package day39_Recap.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand() + " " + getModel() + " is channeling up");
    }

    public void channelDown(){
        System.out.println(getBrand() + " " + getModel() + " is channeling down");
    }

}

/*
4. Create a sub class of Device named TV:
Extra Methods:
channelUp()
channelDown()
 */