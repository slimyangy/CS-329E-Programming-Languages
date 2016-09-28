package Yang.business;

import java.text.NumberFormat;

/**
 * Created by temp on 2/17/2016.
 */
public class CheckingAccount extends Account {

    private double monthlyFee;

    public CheckingAccount(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void subtractMonthlyFee() {
        double balanceF = super.getBalance();
        balanceF = balanceF - this.monthlyFee;
        super.setBalance(balanceF);
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return this.monthlyFee;
    }

    public String getMonthlyFeeFormatted() {
        double monthlyFee = this.getMonthlyFee();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String monthlyFeeFormatted = currency.format(monthlyFee);
        return monthlyFeeFormatted;
    }
}