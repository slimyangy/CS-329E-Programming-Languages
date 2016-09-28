package business;

/**
 * Created by temp on 2/19/2016.
 */
public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount() {
        super();
        monthlyFee = 1.00;

    }

    void subtractMonthlyFee() {
        double balanceF = getBalance();
        balanceF = balanceF - monthlyFee;
        setBalance(balanceF);
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    void getMonthlyFee() {
        return monthlyFee;
    }

    String getMonthlyFeeFormatted() {
        double monthlyFee = this.getMonthlyFee();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String monthlyFeeFormatted = currency.format(monthlyFee);
        return monthlyFeeFormatted;
    }
}