package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositTest(){
        //given
        Account sammieAccount = new Account();
        //when i deposit 5000
        sammieAccount.deposit(5000);
        //check that balance is 5000
        int sammieAccountBalance = sammieAccount.getBalance();

        assertEquals(5000, sammieAccountBalance);


    }

    @Test
    public void depositTwiceTest(){
        //given there is an account
        Account sammieAccount = new Account();
        //given that initial balance is 4000
        sammieAccount.deposit(4000);
        //when i deposit 2000
        sammieAccount.deposit(2000);
        //check that balance is 6000
        int sammieAccountBalance = sammieAccount.getBalance();
        assertEquals(6000, sammieAccountBalance);

    }


    @Test
    public void depositNegativeAmountTest() {
        //given there is an account
        Account sammieAccount = new Account();
        //given that initial balance is 4000
        sammieAccount.deposit(4000);
        //when i deposit -2000
        sammieAccount.deposit(-2000);
        //check that balance is 4000
        int sammieAccountBalance = sammieAccount.getBalance();
        assertEquals(4000, sammieAccountBalance);
    }


    @Test
    public void withdrawalTest() {
        //given there is an account
       Account sammieAccount = new Account();
        //given that initial balance is 4000
       sammieAccount.deposit(4000);
        //when i withdraw 2000
       sammieAccount.withdraw(2000, "1234");
        //check that balance is 2000
        int sammieAccountBalance = sammieAccount.getBalance();
        assertEquals(2000, sammieAccountBalance);
    }

    @Test
    public void withdrawNegativeAmountTest() {
        //given there is an account
        Account sammieAccount = new Account();
        //given that there is an initial balance of 4000
        sammieAccount.deposit(4000);
        //when i withdraw a negative amount of -2000
        sammieAccount.withdraw(-2000, "1234");
        assertEquals(4000, sammieAccount.getBalance());
    }

    @Test
    public void noWithdrawBelowMinimumBalanceTest(){
        //given that there is an account
        Account sammieAccount = new Account();
        //give that there is 10000 in the account
        sammieAccount.deposit(10000);
        //when that i withdraw 9000
        sammieAccount.withdraw(9000, "1234");
        //check that balance is still 10000
        assertEquals(10000, sammieAccount.getBalance());
    }

    @Test
    public void withdrawWithRightPinPassTest(){
        //given that we have an account
        Account sammieAccount = new Account();
        //given that we have a pin 1234
        sammieAccount.setPin("1234");
        // given that i have 5000 in my account
        sammieAccount.deposit(5000);
        //when i want to withdraw 3000
        sammieAccount.withdraw(3000,"1234");
        //check that my balance is 2000
        assertEquals(2000, sammieAccount.getBalance());
    }
}
