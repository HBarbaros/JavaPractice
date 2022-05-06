package day36_Inheritance.bookTask;

public class BookObjects {

    public static void main(String[] args) {

        EBook eBook = new EBook();
        eBook.setInfo("Crime and Punishment", "Retribution", "Fjodor Dostojevskij", 19.90, "Large", 576);
        eBook.readBook();
        System.out.println(eBook);

        System.out.println();

        AudioBook audioBook = new AudioBook("Crime and Punishment", "Retribution", "Fjodor Dostojevskij", 19.90, "Long", "third person omniscient point of view");
        audioBook.listen();
        System.out.println(audioBook);

    }

}
