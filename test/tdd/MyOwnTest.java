package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyOwnTest {
    @Test
    public void DepositTest() {
        //given there is an account
        AccountGtb bigMamaAccount = new AccountGtb();
        //given there is a deposit of 5000
        bigMamaAccount.deposit(5000);
        //verify balance is equal to 5000
        int bigMamaBalance = bigMamaAccount.getBalance();
        assertEquals(5000, bigMamaBalance);

    }

    @Test
    public void WithdrawalTest() {
        //given there is an account
        AccountGtb bigMamaAccount = new AccountGtb();
        //given there is a deposit of 8000
        bigMamaAccount.deposit(8000);
        //given there is a withdrawal of 5000
        bigMamaAccount.withdraw(5000, "1234");
        //verify balance is 3000
        int bigMamaBalance = bigMamaAccount.getBalance();
        assertEquals(3000, bigMamaBalance);
    }

    @Test
    public void WithdrawalWithPinTest() {
        //given there is an account
        AccountGtb davidAccount = new AccountGtb();
        //given there is a deposit of 6000
        davidAccount.deposit(6000);
        //given there is a withdrawal of 4000 with Pin 1234
        davidAccount.withdraw(4000, "1234");
        //verify balance is 2000
        int davidAccountBalance = davidAccount.getBalance();
        assertEquals(2000, davidAccountBalance);
    }

    @Test
    public void WithdrawNegativeTest(){
        //given that there is an account
        AccountGtb samsAccount = new AccountGtb();
        //given that there is a deposit of 7000
        samsAccount.deposit(7000);
        //given that there is a withdrawal of -5000
        samsAccount.withdraw(-5000, "1234");
        //verify balance is 7000
        int samsAccountBalance = samsAccount.getBalance();
        assertEquals(7000, samsAccountBalance);
    }

    @Test
    public void MinimumBalanceWithdrawTest() {
        //given that there is an account
        AccountGtb sammieAccount = new AccountGtb();
        //given that there is a deposit of 5000
        sammieAccount.deposit(5000);
        //given that minimum balance is 2000, withdraw 4000
        sammieAccount.withdraw(4000, "1234");
        assertEquals(5000, sammieAccount.getBalance());
    }

    @Test
    public void SetPinTest(){
        //given that there is an account
        AccountGtb sammieAccount = new AccountGtb();
        //given that there is a deposit of 3000
        sammieAccount.deposit(3000);
        //given that there is a need to change pin
        sammieAccount.setPin("4321");
        //given that there is a withdrawal of 1000
        sammieAccount.withdraw(1000, "1234");
        int sammieAccountBal = sammieAccount.getBalance();
        assertEquals(2000, sammieAccountBal);
    }
}
