package day35_Encapsulation;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(5.5, 10.5, 50,true);
        System.out.println(carpet);

        carpet.setWidth(10);
        carpet.setLength(20);
        carpet.setUnitPrice(80);
        carpet.setPersian(false);

        System.out.println(carpet);





    }

}
