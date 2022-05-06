package day33_Statics;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Ramazan", 11, 'M');
        System.out.println(person1);
        person1.eat("Hamburger");
        person1.drink("Cola");
        person1.sleep();

        System.out.println();

        System.out.println(person1.name + " is human : " + person1.isHuman);
        System.out.println(person1.name + " has nose : " + person1.hasNose);
        System.out.println(person1.name + " has wings : " + person1.hasWings);
        System.out.println(person1.name + "'s number of head : " + person1.numberOfHead);
        System.out.println(person1.name + "'s number of eyes : " + person1.numberOfEyes);


        System.out.println();

        Person person2 = new Person("Hale", 30, 'F');
        System.out.println(person2);
        person2.eat("Pizza");
        person2.drink("Fanta");
        person2.sleep();

        System.out.println();

        System.out.println(person2.name + " is human : " + person2.isHuman);
        System.out.println(person2.name + " has nose : " + person2.hasNose);
        System.out.println(person2.name + " has wings : " + person2.hasWings);
        System.out.println(person2.name + "'s number of head : " + person2.numberOfHead);
        System.out.println(person2.name + "'s number of eyes : " + person2.numberOfEyes);

    }

}
