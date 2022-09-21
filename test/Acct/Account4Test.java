package Acct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Account4Test {
    Account4 account4;
    @BeforeEach

    public void setUp(){
        account4 = new Account4("Glory", "1913",
                "0022448843");
    }
    @Test
    public void testThatObjectAccountExist(){
        // given that i have an account
         assertNotNull(account4);
    }
    @Test
    public void testThatMoneyCanBeDeposited(){
    account4.deposit(5000);
    assertEquals(5000,account4.getBalance());
    }
    @Test
    public void testThatMoneyCanBeWithdrawn(){
        account4.deposit(5000);
        account4.withdraw(4000, "4040");
        assertEquals(1000, account4.getBalance());
    }


}