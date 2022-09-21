package chapter3;

/*(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
  Ensure that the withdrawal amount does not exceed
        the Account’s balance. If it does, the balance should be left unchanged and the method should print
        a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
        (Fig. 3.9) to test method withdraw.*/

public class Account0 {

    private String name;
    private double balance;
    private int pin;
//    private double amount;

    public Account0(String name, double balance, int pin){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBalance(int balance) {
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    public void withdraw(double amount){
        if (amount <= balance)
            balance = balance - amount;
        }
    }
