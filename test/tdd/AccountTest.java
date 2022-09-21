package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoney() {
        //given i have an account
        Account amirahTeensAccount = new Account();
        //when i deposit 3000
        amirahTeensAccount.deposit(3000);
        //check my balance increases by 3000
        assertEquals(3000, amirahTeensAccount.getBalance());

    }

    @Test
    public void negativeDepositShouldNotWorkTest() {
        //given i have an account
        Account amirahTeensAccount = new Account();
        //given that balance is 10000 (Precondition)
        assertEquals(10000, amirahTeensAccount.getBalance());
        // when i deposit -5000 (Action)
        amirahTeensAccount.deposit(-5000);
        //check that balance is 10000 (Test / check / Assert)
        assertEquals(10000, amirahTeensAccount.getBalance());
    }

    @Test
    public void testThatWeCanDepositMoney(){
        Account myAccount = new Account();
        myAccount.deposit(5000);
        myAccount.deposit(2000);
        assertEquals(7000, myAccount.getBalance());
    }

    @Test
    public void testThatWeCanNotDepositNegativeAmount(){
        Account myAccount = new Account();
        myAccount.deposit(-5000);
        assertEquals(0, myAccount.getBalance());
    }
    @Test
    public void testThatAccountCanWithdraw(){
        Account myAccount = new Account();
        myAccount.deposit(5000);
        myAccount.deposit(2000);
        assertEquals(7000, myAccount.getBalance());
        myAccount.withdraw(1500);
        assertEquals(5500, myAccount);
    }
}

