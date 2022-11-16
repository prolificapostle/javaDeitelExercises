package tdd;

public class AccountGtb {
    private String name;
    private int balance;
    private String pin = "1234";

    public void deposit(int amount) {
        balance = balance + amount;
    }
    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
        int minimumBalance = 2000;
        if (amount > 0 && amount <= (balance - minimumBalance)) {
            balance = balance - amount;
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
