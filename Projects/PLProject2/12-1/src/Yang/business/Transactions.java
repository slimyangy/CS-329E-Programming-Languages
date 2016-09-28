package Yang.business;

import Yang.account.interfaces.Depositable;
import Yang.account.interfaces.Withdrawable;

/**
 * Created by temp on 2/17/2016.
 */

public class Transactions {
    public Transactions () {}

    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }
}
