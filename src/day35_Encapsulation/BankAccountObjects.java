package day35_Encapsulation;

public class BankAccountObjects {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("Barbaros", 123456789, 50000);
        System.out.println(bankAccount);

        bankAccount.deposit(500);
        bankAccount.withdraw(1000);

        System.out.println(bankAccount);




    }

}
