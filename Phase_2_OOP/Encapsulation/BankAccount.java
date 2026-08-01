package Encapsulation;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    //getter and setter methods for accountNumber, accountHolderName, and balance
    // why to use getter and setter methods?
    // Getter and setter methods are used to access and modify the private fields of a class.
    // They provide a way to encapsulate the data and control how it is accessed and modified   
    public String getAccountNumber() {//getter use to get the value of accountNumber
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {//setter use to set(display) the value of accountNumber
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public static void main(String[] args) {

        System.out.println("Learning Topic: Encapsulation");
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("987654321", "Jane Doe", 500.0);
        account1.deposit(500.0);
        account2.withdraw(200.0);
        System.out.println(account1.getAccountHolderName() + "'s balance is $" + account1.getBalance());
        System.out.println(account2.getAccountHolderName() + "'s balance is $" + account2.getBalance());    


    }
}
