package day36_Inheritance.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("Iphone", "13 Pro Max", "Large", "Swart", 1500);
        iphone.facetime("flowersLove@gmail.com");
        iphone.facetime(123456789);
        System.out.println(iphone);

        System.out.println();

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "Galaxy s12", "Medium", "Gold", 1000);
        samsung.freeze();
        System.out.println(samsung);

        System.out.println();

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "3310", "Small", "Blue", 350);
        nokia.selfDefense();
        System.out.println(nokia);












    }

}
