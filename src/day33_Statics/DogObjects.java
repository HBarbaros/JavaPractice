package day33_Statics;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Balzac", 12.5, "L", 'M', 5, "Gold");
        System.out.println(dog1);

        dog1.eat();
        dog1.sleep();
        dog1.play();


    }

}
