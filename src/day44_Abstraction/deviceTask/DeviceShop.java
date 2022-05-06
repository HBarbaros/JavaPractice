package day44_Abstraction.deviceTask;

public class DeviceShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("14Pro Max", 1500, "Gold", "Large", true, true);
        System.out.println(iphone);
        iphone.text(55245827);
        iphone.call(55248574);
        iphone.downloadApp();
        iphone.turnOn();
        iphone.turnOff();
        iphone.appStoreName();
        iphone.OS();

        System.out.println("----------------------------");

        Samsung samsung = new Samsung("S22 Ultra", 1300, "Blue", "Large", true, true);
        System.out.println(samsung);
        samsung.text(5659585);
        samsung.call(9658745);
        samsung.downloadApp();
        samsung.turnOn();
        samsung.turnOff();
        samsung.appStoreName();
        samsung.OS();


        System.out.println("----------------------------");

        Google google = new Google("Xiaomi", 500, "Green", "Medium", true, true);
        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.call(75486568);
        google.text(53465465);
        google.downloadApp();
        google.appStoreName();
        google.OS();

        System.out.println("----------------------------");

        PersonalComputer personalComputer = new PersonalComputer("Asus", "C100", 1500, "Black", "Large", true, true);
        System.out.println(personalComputer);

        System.out.println("----------------------------");

        Desktop desktop = new Desktop("Desktop", "Desktop", 500, "Gray", "Medium", true, true);
        System.out.println(desktop);

        System.out.println("----------------------------");

        Laptop laptop =  new Laptop("Mac", "Pro", 2500, "Space Gray", "Medium", true, true);
        System.out.println(laptop);




    }

}
