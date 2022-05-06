package day36_Inheritance.phoneTask;

public class Iphone extends Phone{

    public void facetime(long phoneNumber){
        System.out.println(model + " is face timing with " + phoneNumber);
    }

    public void facetime(String email){
        System.out.println(model + " is send email to " + email);
    }



}
