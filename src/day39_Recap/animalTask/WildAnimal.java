package day39_Recap.animalTask;

public class WildAnimal extends Animal {

    private boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
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

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }

    public String toString() {
        return "WildAnimal{" +
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
3. Create a subclass of Animal named WildAnimal:
Variable:
isWild,
isFriendly, isPlayable
Extra Methods:
hunt()
 */

/*
5. Create the following subclasses of WildAnimal and Override the
hunt method, and add any extra methods that are needed:
1. Lion
2. Tiger
3. Eagle
4. Bear
5. Python
6. Crocodile
 */