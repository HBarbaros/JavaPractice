package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fruit");
    }

    public void fly(){
        System.out.println(getName() + " is flying");
    }

    public void sing(){
        System.out.println(getName() + " is singing");
    }

}
