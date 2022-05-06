package day39_Recap.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is calling " + phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getBrand() + " " + getModel() + " is texting " + phoneNum);
    }

}

/*
2. Create a subclass of Device named Phone:
Extra Methods:
call(long
phoneNum), text(long phoneNum)
 */

/*
5. Create the following subclasses of Phone and add any extra
methods that are needed:
1. Iphone
2. Samsung
3. BlackBerry
4. Google
5. Nokia
 */