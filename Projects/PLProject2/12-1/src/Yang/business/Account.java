package Yang.business;

/**
 * Created by temp on 2/17/2016.
 */
import Yang.account.interfaces.Balanceable;
import Yang.account.interfaces.Depositable;
import Yang.account.interfaces.Withdrawable;

import java.text.NumberFormat;

public class Account implements Balanceable, Withdrawable, Depositable {

    private double balance = 0.0D;

    public Account() {}

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public String getBalanceFormatted(){
        double balance = this.getBalance();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(balance);
        return balanceFormatted;
    }
}
