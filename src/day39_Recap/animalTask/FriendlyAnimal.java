package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    private boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }

    public void pet(){
        System.out.println(getName() + " is allows to be pet");
    }

    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}


/*
2. Create a subclass of Animal named FriendlyAnimal:
Variable:
isWild
isFriendly
isPlayable
Extra methods:
play()
pet()
 */

/*
4. Create the following sub classes of FriendlyAnimal and Override
the eat method
1. Dog:
Extra methods:
bark()
2. Cat:
Extra methods:
scratch()
meow()
3. Dolphin:
Extra methods:
swim()
4. Parrot:
Extra methods:
fly()
sing()
 */