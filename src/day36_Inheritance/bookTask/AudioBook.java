package day36_Inheritance.bookTask;

public class AudioBook extends Book{

    public String length, narrator;

    public AudioBook(String title, String type, String author, double price, String length, String narrator) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.length = length;
        this.narrator = narrator;
    }

    public String toString() {
        return "AudioBook{" +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +  '\'' +
                "length='" + length + '\'' +
                ", narrator='" + narrator +
                '}';
    }

    public void listen(){
        System.out.println("Listening to " + title);
    }

}
