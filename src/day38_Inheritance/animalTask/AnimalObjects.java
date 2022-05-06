package day38_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Minnosh", "British", 2, 'F', "Small", "Brown" );
        cat.eat();
        System.out.println(cat);

        Dog dog = new Dog("Lucky", "Husky", 4, 'M', "Medium", "White");
        dog.eat();
        System.out.println(dog);

        Tiger tiger = new Tiger("Sebilla", "Bengal", 8, 'M', "Large", "Yellow");
        tiger.eat();
        System.out.println(tiger);

        Eagle eagle = new Eagle("Latun", "Fish-Eagle", 5, 'F', "Medium", "Black&White");
        eagle.eat();
        System.out.println(eagle);

    }

}
