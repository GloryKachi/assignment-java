package Acct;

public class Account4 {
private String accountName;
private String accountPin;
private String accountNumber;

private int amount;
private int balance;


public Account4(String accountName,String accountPin,
                String accountNumber){

    this.accountName = accountName;
    this.accountPin = accountPin;
    this.accountNumber = accountNumber;
}

    public void deposit(int amount) {
    balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
    balance = balance - amount;
    }
}
