package day33_Statics;

public class Address {

    public String buildingNumber,street, city, state, zipCode;


    public static String country = "Sweden", planet = "Earth";

    public Address(String buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}

/*
5. Address Task:
		1. Create a class named Address:
		    Attributes:
		        instance:  street, city, state, zipCode;
		        static: country, planet
	        Add a constructor that can set All the fields (instances)
		    Actions
		            toString: returns the address
		                        EX:
		                            7925 Jones Branch Dr
		                            McLean Va, 22012
 */