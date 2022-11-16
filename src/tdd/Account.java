package tdd;

public class Account {
    private int balance;
    private String pin;

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
        int minimumBalance = 2000;
        if (pin.equals (this.pin)){
        if (amount > 0 && amount <= (balance - minimumBalance)){
            balance = balance - amount;}
    }}

    public void setPin(String pin) {
        this.pin = pin;
    }
}
