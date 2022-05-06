package day35_Encapsulation;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(0);
        }

        System.out.println("Depositing €" + amount + " to the account " + accountNumber);
        balance += amount;

    }

    public void withdraw(double amount){
        if (amount <= 0){
            System.err.println("Depositing amount can not be negative or zero");
            System.exit(0);
        }

        if (balance <= 0){
            System.err.println("Insufficient balance"); // yetersiz bakiye
            System.exit(0);
        }

        System.out.println("Withdrawing €" + amount + " from the account " + accountNumber);
        balance -= amount;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= €" + balance +
                '}';
    }

    /*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance
        encapsulate all the fields
        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()
 */





}
