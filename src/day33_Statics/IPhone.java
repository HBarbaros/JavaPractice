package day33_Statics;

public class IPhone {

    public String model;
    public double price;
    public String color;
    public double size;

    public static String brand = "Apple";
    public static String OS = "iOS";
    public static String madeIn = "China";

    public IPhone(String model, double price, String color, double size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " is face timing you with number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is face timing you with email " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling  " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting to " + phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

/*
4. IPhone Task:
		1. Create a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */