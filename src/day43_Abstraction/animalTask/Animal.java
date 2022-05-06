package day43_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private String breed;
    private int age;
    private char gender;
    private String size, color;

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setGender(gender);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
