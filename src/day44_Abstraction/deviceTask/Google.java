package day44_Abstraction.deviceTask;

public class Google extends Phone implements Downloadable, AndroidApps{

    public Google( String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps");
    }

}
