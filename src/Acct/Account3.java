package Acct;

public class Account3 {
    private String name;
    private int balance;
    private int withdraw;


    public Account3 (String name,int balance,int withdraw){

        this.name = name;
        this.balance = balance;
        this.withdraw = withdraw;
    }

    public Account3(String name) {

    }

    public Account3() {

    }

    public void setName(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
    return balance;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getWithdraw() {
        return withdraw;
    }

}




