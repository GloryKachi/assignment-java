package accountTdd;

import Airconditional.accountTdd.AccountTdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTddTest {

    AccountTdd accountTdd;
    @BeforeEach

    public void setUp(){

         accountTdd = new AccountTdd("Kachi","1960",
                "08024454298");
    }

    @Test
    public void checkThatAccountTddExist(){
        assertNotNull(accountTdd);
    }
    @Test
    public void checkThatICanDepositMoneyInAccountTdd(){
       accountTdd.deposit(9000);
       assertEquals(9000,accountTdd.getBalance());
    }
    @Test
    public void checkThatICanWithdraw(){
        accountTdd.deposit(9000);
        accountTdd.withdraw(5000);
        assertEquals(4000,accountTdd.getBalance());
    }

}