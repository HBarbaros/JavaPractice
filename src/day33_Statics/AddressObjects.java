package day33_Statics;

public class AddressObjects {

    public static void main(String[] args) {

        Address address1 = new Address("14C", "Badhusvagen", "Boras", "Vastra Gotland", "51630");
        System.out.println(address1);
        System.out.println("Country : " + address1.country);
        System.out.println("Planet : " + address1.planet);



    }

}
