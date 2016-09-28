package business;

/**
 * Created by temp on 2/19/2016.
 */
import java.text.NumberFormat;

public class Account implements Balanceable, Withdrawable, Depositable{

    private double balance;

    public Account() {
        this.balance = 1000.00
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(amount) {
        this.balance = amount;
    }

    public String getBalanceFormatted(){
        double balance = this.getBalance();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(balance);
        return balanceFormatted;
    }
}
