package Airconditional.accountTdd;

public class AccountTdd {

    private String name;
    private String pin;
    private String phoneNumber;

    private int deposit;

    private int amount;

    private int balance;

    private int withdraw;


    public AccountTdd(String name,String pin,String phoneNumber){

        this.name = name;
        this.pin = pin;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount){
       balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }








}
